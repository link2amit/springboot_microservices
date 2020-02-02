package com.microservices.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.bean.ConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency_converters/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVariables = new HashMap<String, String>();

		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<ConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/exchange_rates/from/{from}/to/{to}", ConversionBean.class, uriVariables);
		ConversionBean response = responseEntity.getBody();

		System.out.println(response);
		return new ConversionBean(response.getId(), from, to, response.getExchangeRate(), response.getQuantity(),
				response.getExchangeRate().multiply(quantity), response.getPort());
	}

}
