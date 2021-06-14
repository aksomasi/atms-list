package com.mobiquity.atms.serviceImpls;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;
import com.mobiquity.atms.services.AtmListService;
import com.mobiquity.atms.util.AtmLsitUtil;

@Service
public class AtmListServiceImpl implements AtmListService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	AtmLsitUtil atmLsitUtil;

	String externalUrl = "https://www.ing.nl/api/locator/atms/";

	public List<AtmLocator> atmLocators;

	@Override
	public List<AtmLocator> getAllAtmsWithUnformatted() throws JsonMappingException, JsonProcessingException {
		if (atmLocators == null) {
			String response = restTemplate.getForObject(externalUrl, String.class);
			String parsedResponse = response.substring(6, response.length());
			atmLocators = atmLsitUtil.convertParsedResponseToAtmLocatorList(parsedResponse);
		}
		return atmLocators;
	}

	@Override
	public List<AtmLocation> getAllAtmsWithformatted() throws JsonMappingException, JsonProcessingException {
		return atmLsitUtil.convertParsedResponseToAtmLocationsList(getAllAtmsWithUnformatted());
	}

	@Override
	public List<AtmLocator> getAllAtmsByCityWithUnformatted(String city)
			throws JsonMappingException, JsonProcessingException {
		List<AtmLocator> atmLocators = getAllAtmsWithUnformatted();

		return atmLocators.stream().filter(atmLocator -> atmLocator.getAddress().getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
	}

	@Override
	public List<AtmLocation> getAllAtmsByCityWithformatted(String city)
			throws JsonMappingException, JsonProcessingException {
		List<AtmLocation> atmLocations = getAllAtmsWithformatted();

		return atmLocations.stream().filter(atmLocation -> atmLocation.getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
	}

}
