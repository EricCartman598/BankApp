package com.learningSpring.bankApp.services.ConvertCurrencyImpl;

import com.learningSpring.bankApp.common.YamlParser;
import com.learningSpring.bankApp.services.ConvertCurrency;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
@Primary
public class ConvertCurrencyUsingFile implements ConvertCurrency {
    private final String currenciesFilePath;

    public ConvertCurrencyUsingFile(@Value("currencies.yml") String currenciesFilePath) {
        this.currenciesFilePath = currenciesFilePath;
    }

    @Override
    public Double convert(String fromCurrency, String toCurrency, Double amount) {
        Map<String, Double> exchangeRates = YamlParser.getExchangeRates(currenciesFilePath);
        for (Map.Entry<String, Double> entry : exchangeRates.entrySet()) {
            if(entry.getKey().equals(fromCurrency + "," + toCurrency)) {
                return amount * entry.getValue();
            }
        }
        return null;
    }
}
