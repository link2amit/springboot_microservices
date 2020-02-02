package com.microservices.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.ConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency_converters/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable int quantity) {
		return new ConversionBean(1l,
				from, to,
				BigDecimal.ONE, BigDecimal.valueOf(quantity),
				BigDecimal.TEN, BigDecimal.ZERO );
	}

}
