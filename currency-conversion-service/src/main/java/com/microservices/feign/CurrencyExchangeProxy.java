package com.microservices.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.microservices.bean.ConversionBean;

@FeignClient(name="currency-exchange-service" )
public interface CurrencyExchangeProxy {

	@GetMapping("/exchange_rates/from/{from}/to/{to}")
	public ConversionBean getExchangeRate(@PathVariable("from") String from, @PathVariable("to") String to);
}
