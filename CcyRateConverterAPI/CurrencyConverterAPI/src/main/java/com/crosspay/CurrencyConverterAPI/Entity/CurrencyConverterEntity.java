package com.crosspay.CurrencyConverterAPI.Entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/*
 * Created By: Sutharsanan Chinnaiyan
 * Created On: 15 Jul 2020
*/

/*
 * CURRENCYCONVERTER -Table created in cprate schema to fetch current rate.
 * Primary key for this table is fromCurrency and toCurrency
 */
 
@Entity(name = "CURRENCYCONVERTER")
@Table(name = "CURRENCYCONVERTER")
@IdClass(CurrencyConverterId.class)
public class CurrencyConverterEntity {
	

	@Id
	@Column(length = 3)
	private String fromCurrency;
	@Id
	@Column(length = 3)
	private String toCurrency;
	private double rate;
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
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	

}
