package com.mobiquity.atms.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;

@Component
public class AtmLsitUtil {

	public List<AtmLocator> convertParsedResponseToAtmLocatorList(String parsedResponse)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		AtmLocator[] resp = objectMapper.readValue(parsedResponse, AtmLocator[].class);
		return Arrays.asList(resp);
	}

	public List<AtmLocation> convertParsedResponseToAtmLocationsList(List<AtmLocator> atmLocators) {

		List<AtmLocation> locations = new ArrayList<AtmLocation>();
		atmLocators.forEach(atmLocator -> {
			if (atmLocator != null) {
				locations
						.add(new AtmLocation(atmLocator.getAddress().getCity(), atmLocator.getAddress().getPostalcode(),
								atmLocator.getAddress().getStreet(), atmLocator.getFunctionality()));
			}
		});
		return locations;
	}

}
