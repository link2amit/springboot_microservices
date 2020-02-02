package com.microservices.bean;

import java.math.BigDecimal;

public class CurrencyExchangeBean {

	private long id;
	private String from;
	private String to;
	private BigDecimal exchangeRate;
	private BigDecimal port;

	public CurrencyExchangeBean() {
		super();
	}

	public CurrencyExchangeBean(long id, String from, String to, BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getPort() {
		return port;
	}

	public void setPort(BigDecimal port) {
		this.port = port;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrencyExchangeBean other = (CurrencyExchangeBean) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrencyExchangeBean [id=" + id + ", from=" + from + ", to=" + to + ", exchangeRate=" + exchangeRate
				+ ", port=" + port + "]";
	}

}
