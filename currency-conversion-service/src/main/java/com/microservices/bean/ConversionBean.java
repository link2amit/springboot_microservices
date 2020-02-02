package com.microservices.bean;

import java.math.BigDecimal;

public class ConversionBean {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private BigDecimal quantity;
	private BigDecimal totalValue;
	private BigDecimal port;

	public ConversionBean() {
		super();
	}

	public ConversionBean(long id, String from, String to, BigDecimal conversionRate, BigDecimal quantity,
			BigDecimal totalValue, BigDecimal port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.totalValue = totalValue;
		this.port = port;
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

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public BigDecimal getPort() {
		return port;
	}

	public void setPort(BigDecimal port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ConversionBean [id=" + id + ", from=" + from + ", to=" + to + ", conversionRate=" + conversionRate
				+ ", quantity=" + quantity + ", totalValue=" + totalValue + ", port=" + port + "]";
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
		ConversionBean other = (ConversionBean) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
