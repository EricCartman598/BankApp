package com.learningSpring.bankApp.services;

import org.springframework.stereotype.Component;

@Component
public interface ConvertCurrency {
    Double convert(String fromCurrency, String toCurrency, Double amount);
}
