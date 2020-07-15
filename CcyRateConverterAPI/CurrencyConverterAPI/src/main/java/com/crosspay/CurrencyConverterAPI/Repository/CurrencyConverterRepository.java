package com.crosspay.CurrencyConverterAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.crosspay.CurrencyConverterAPI.Entity.CurrencyConverterEntity;
@Repository
public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverterEntity, Integer> {
	
	/*
	 * To fetch current rate by passing parameters fromCcy and toCcy
	 * */
	@Query("select ccy from CURRENCYCONVERTER ccy "
			+ "where ccy.fromCurrency=:fromCurrency "
			+ "and ccy.toCurrency=:toCurrency")
	CurrencyConverterEntity findByCurrency(@Param("fromCurrency") String fromCurrency, @Param("toCurrency") String toCurrency);

}
