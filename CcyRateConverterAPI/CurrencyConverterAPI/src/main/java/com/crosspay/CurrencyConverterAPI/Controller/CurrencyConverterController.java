package com.crosspay.CurrencyConverterAPI.Controller;

import org.springframework.web.bind.annotation.RestController;
import com.crosspay.CurrencyConverterAPI.Service.CurrencyConverterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crosspay.CurrencyConverterAPI.Entity.CurrencyConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
	 * Created By: Sutharsanan Chinnaiyan
	 * Created On: 15 Jul 2020
*/
@RestController
public class CurrencyConverterController {

	@Autowired
	private CurrencyConverterService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/ccyconvert")
	public CurrencyConverter fetchRates(@RequestBody CurrencyConverter request) {
		return service.getCurrentExchangeAmount(request);
	}
	
}
