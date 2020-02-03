package com.microservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.ConversionBean;
import com.microservices.feign.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyExchangeProxy proxy;

	@GetMapping("/currency_converters/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		/*
		 * Map<String, String> uriVariables = new HashMap<String, String>();
		 * 
		 * uriVariables.put("from", from); uriVariables.put("to", to);
		 * ResponseEntity<ConversionBean> responseEntity = new
		 * RestTemplate().getForEntity(
		 * "http://localhost:8000/exchange_rates/from/{from}/to/{to}",
		 * ConversionBean.class, uriVariables);
		 */
		ConversionBean response = proxy.getExchangeRate(from, to);
//		responseEntity.getBody();

		return new ConversionBean(response.getId(), from, to, response.getExchangeRate(), quantity,
				response.getExchangeRate().multiply(quantity), response.getPort());
	}

}
