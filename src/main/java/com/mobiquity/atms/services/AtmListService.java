package com.mobiquity.atms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;

@Service
public interface AtmListService {

	public List<AtmLocator> getAllAtmsWithUnformatted() throws JsonMappingException, JsonProcessingException;

	public List<AtmLocator> getAllAtmsByCityWithUnformatted(String city)
			throws JsonMappingException, JsonProcessingException;

	public List<AtmLocation> getAllAtmsWithformatted() throws JsonMappingException, JsonProcessingException;

	public List<AtmLocation> getAllAtmsByCityWithformatted(String city)
			throws JsonMappingException, JsonProcessingException;

}
