package com.mobiquity.atms.serviceImpls;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mobiquity.atms.model.AtmLocation;
import com.mobiquity.atms.model.AtmLocator;

@SpringBootTest
public class AtmListServiceImplTest {

	@Autowired
	AtmListServiceImpl atmListService;

	@Test
	public void testAtmsWithformatted() throws Exception {
		List<AtmLocation> entity = atmListService.getAllAtmsWithformatted();
		assertEquals(3159, entity.size());
	}

	@Test
	public void testAtmsWithUnformatted() throws Exception {
		List<AtmLocator> entity = atmListService.getAllAtmsWithUnformatted();
		assertEquals(3159, entity.size());
	}

	@Test
	public void testAtmsWithUnformattedByCity() throws Exception {
		List<AtmLocator> entity = atmListService.getAllAtmsByCityWithUnformatted("Bakhuizen");
		assertEquals(1, entity.size());
	}

	@Test
	public void testAtmsWithformattedByCity() throws Exception {
		List<AtmLocation> entity = atmListService.getAllAtmsByCityWithformatted("Bakhuizen");
		assertEquals(1, entity.size());
	}

}
