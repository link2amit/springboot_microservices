/**
 * 
 */
package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.bean.CurrencyExchangeBean;

/**
 * @author asrivastava
 *
 */
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeBean, Integer>{

	public CurrencyExchangeBean findByFromAndTo(String from, String to);
}
