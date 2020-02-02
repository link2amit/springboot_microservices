package com.microservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.CurrencyExchangeBean;
import com.microservices.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepository exchangeRepo;

	@Autowired
	Environment env;

	@GetMapping("/exchange_rates/from/{from}/to/{to}")
	public CurrencyExchangeBean getExchangeRate(@PathVariable String from, @PathVariable String to) {
		CurrencyExchangeBean currencyExchangeBean = exchangeRepo.findByFromAndTo(from, to);
		currencyExchangeBean.setPort(new BigDecimal(env.getProperty("server.port")));
		return currencyExchangeBean;
		
	}
}
