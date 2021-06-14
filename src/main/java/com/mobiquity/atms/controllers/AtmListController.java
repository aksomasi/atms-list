package com.mobiquity.atms.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.atms.exceptions.AtmLocatorException;
import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;
import com.mobiquity.atms.services.AtmListService;

@RestController
@CrossOrigin
public class AtmListController {

	private static final Logger LOG = LogManager.getLogger(AtmListController.class.getName());

	@Autowired
	AtmListService atmListService;

	@GetMapping("getAllAtms/unformatted")
	public ResponseEntity<List<AtmLocator>> getAllAtmsWithUnformatted() throws AtmLocatorException {
		try {
			LOG.info("[ getAllAtmsWithUnformatted method {} ]");
			return new ResponseEntity<List<AtmLocator>>(atmListService.getAllAtmsWithUnformatted(), HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("[ getAllAtmsWithUnformatted Exception {} ]", e.getMessage());
			throw new AtmLocatorException("Exception", e.getMessage());
		}
	}

	@GetMapping("getAllAtms/formatted")
	public ResponseEntity<List<AtmLocation>> getAllAtmsWithformatted() throws AtmLocatorException {
		try {
			LOG.info("[ getAllAtmsWithformatted method {} ]");
			return new ResponseEntity<List<AtmLocation>>(atmListService.getAllAtmsWithformatted(), HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("[ getAllAtmsWithformatted Exception {} ]", e.getMessage());
			throw new AtmLocatorException("Exception", e.getMessage());
		}
	}

	@GetMapping("getAllAtmsByCity/unformatted")
	public ResponseEntity<List<AtmLocator>> getAllAtmsByCityWithUnformatted(@RequestParam String city)
			throws AtmLocatorException {
		try {
			LOG.info("[ getAllAtmsByCityWithUnformatted method {} ]");
			return new ResponseEntity<List<AtmLocator>>(atmListService.getAllAtmsByCityWithUnformatted(city),
					HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("[ getAllAtmsByCityWithUnformatted Exception {} ]", e.getMessage());
			throw new AtmLocatorException("Exception", e.getMessage());
		}
	}

	@GetMapping("getAllAtmsByCity/formatted")
	public ResponseEntity<List<AtmLocation>> getAllAtmsByCityWithformatted(@RequestParam String city)
			throws AtmLocatorException {
		try {
			LOG.info("[ getAllAtmsByCityWithformatted method {} ]");
			return new ResponseEntity<List<AtmLocation>>(atmListService.getAllAtmsByCityWithformatted(city),
					HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("[ getAllAtmsByCityWithformatted Exception {} ]", e.getMessage());
			throw new AtmLocatorException("Exception", e.getMessage());
		}
	}
}
