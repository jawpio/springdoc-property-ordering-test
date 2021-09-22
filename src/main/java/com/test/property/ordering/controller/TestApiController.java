package com.test.property.ordering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.property.ordering.model.SampleResponseClass;

@RestController
public class TestApiController {

	@GetMapping(value = "/test")
	public SampleResponseClass getInvoices() {
		return null;
	}

}
