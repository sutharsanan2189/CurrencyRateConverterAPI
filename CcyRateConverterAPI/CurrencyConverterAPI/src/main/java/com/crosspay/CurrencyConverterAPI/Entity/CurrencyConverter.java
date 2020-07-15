package com.crosspay.CurrencyConverterAPI.Entity;

/*
 * Created By: Sutharsanan Chinnaiyan
 * Created On: 15 Jul 2020
*/
public class CurrencyConverter {
	private String fromCurrency;
	private Double fromAmount;
	private String toCurrency;
	private Double toAmount;
	
	//default constructor
	public CurrencyConverter() {
	}
	
	//parameterized constructor
	public CurrencyConverter(String fromCurrency, Double fromAmount, String toCurrency, Double toAmount) {
		super();
		this.fromCurrency = fromCurrency;
		this.fromAmount = fromAmount;
		this.toCurrency = toCurrency;
		this.toAmount = toAmount;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public Double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Double getToAmount() {
		return toAmount;
	}

	public void setToAmount(Double toAmount) {
		this.toAmount = toAmount;
	}

	 
	
}
