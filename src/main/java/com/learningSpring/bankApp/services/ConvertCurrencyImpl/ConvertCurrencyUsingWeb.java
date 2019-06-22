package com.learningSpring.bankApp.services.ConvertCurrencyImpl;

import com.learningSpring.bankApp.services.ConvertCurrency;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Component
@Scope("prototype")
public class ConvertCurrencyUsingWeb implements ConvertCurrency {

    @Override
    public Double convert(String fromCurrency, String toCurrency, Double amount) {
        throw new NotImplementedException();
    }
}
