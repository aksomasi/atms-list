package com.mobiquity.atms.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import com.mobiquity.atms.model.Address;
import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;
import com.mobiquity.atms.services.AtmListService;

@SpringBootTest
public class AtmListControllerTest {

	@InjectMocks
	AtmListController atmController;

	@Mock
	AtmListService atmListService;

	@Test
	public void testPositiveResponseCodeWithUnformatted() throws Exception {
		List<AtmLocator> response = new ArrayList<>();
		ResponseEntity<List<AtmLocator>> entity = atmController.getAllAtmsWithUnformatted();
		when(atmListService.getAllAtmsWithUnformatted()).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}
	
	@Test
	public void testPositiveResponseCodeWithUnformattedByCity() throws Exception {
		List<AtmLocator> response = new ArrayList<>();
		Address add = new Address();
		add.setCity("Abc");
		AtmLocator atmLocator = new AtmLocator();
		atmLocator.setAddress(add);
		response.add(atmLocator);
		ResponseEntity<List<AtmLocator>> entity = atmController.getAllAtmsWithUnformatted();
		when(atmListService.getAllAtmsWithUnformatted()).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}

	@Test
	public void testPositiveResponseCodeWithFormatted() throws Exception {
		List<AtmLocation> response = new ArrayList<>();
		ResponseEntity<List<AtmLocation>> entity = atmController.getAllAtmsWithformatted();
		when(atmListService.getAllAtmsWithformatted()).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}

	@Test
	public void testPositiveResponseCodeWithFormattedByCity() throws Exception {
		List<AtmLocation> response = new ArrayList<>();
		AtmLocation atmLocation = new AtmLocation("Hyderabad", "523001", "Koti", "ATM");
		response.add(atmLocation);
		ResponseEntity<List<AtmLocation>> entity = atmController.getAllAtmsByCityWithformatted("Hyderabad");
		when(atmListService.getAllAtmsWithformatted()).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}

}
