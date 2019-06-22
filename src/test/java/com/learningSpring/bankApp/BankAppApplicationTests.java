package com.learningSpring.bankApp;

import com.learningSpring.bankApp.services.ConvertCurrency;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAppApplicationTests {

	Double convertedAmount = 10.0;

	@Autowired
	private ConvertCurrency convertCurrency;

	@Before
	public void beginTest() {
		BankAppApplication bankAppApplication = new BankAppApplication();
	}

	@Test
	public void convertUsdToRub() {
		Double convertedValue = convertCurrency.convert("USD", "RUB", convertedAmount);
		System.out.println(convertedAmount + " USD = " + convertedValue + " RUB");
	}

	@Test
	public void convertRubToUsd() {
		Double convertedValue = convertCurrency.convert("RUB", "USD", convertedAmount);
		System.out.println(convertedAmount + " RUB = " + convertedValue + " USD");
	}

}
