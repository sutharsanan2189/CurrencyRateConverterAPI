package com.crosspay.CurrencyConverterAPI.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crosspay.CurrencyConverterAPI.Entity.CurrencyConverter;
import com.crosspay.CurrencyConverterAPI.Entity.CurrencyConverterEntity;
import com.crosspay.CurrencyConverterAPI.Repository.CurrencyConverterRepository;

@Service
public class CurrencyConverterService{

	@Autowired
	private CurrencyConverterRepository cur_rep;
	public CurrencyConverter getCurrentExchangeAmount(CurrencyConverter request) {
		
		/*
		 * Repository connecting DB to fetch current Rate by passing fromCcy and toCcy parameters.
		 */
		CurrencyConverterEntity currency_obj = cur_rep.findByCurrency(request.getFromCurrency(), request.getToCurrency());
		
		if(currency_obj == null)
			return null;
		
		request.setToAmount(currency_obj.getRate() * request.getFromAmount());
		return request;
		
	}

}
