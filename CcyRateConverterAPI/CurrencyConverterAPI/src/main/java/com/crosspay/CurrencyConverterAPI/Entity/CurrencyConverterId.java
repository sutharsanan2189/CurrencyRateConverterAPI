package com.crosspay.CurrencyConverterAPI.Entity;

import java.io.Serializable;

/*
 * Created By: Sutharsanan Chinnaiyan
 * Created On: 15 Jul 2020
*/

public class CurrencyConverterId implements Serializable {
	

	private static final long serialVersionUID = 2299461160073923086L;
	private String fromCurrency;
	private String toCurrency;
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

}
