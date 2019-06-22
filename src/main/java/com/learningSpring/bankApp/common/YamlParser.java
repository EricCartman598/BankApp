package com.learningSpring.bankApp.common;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlParser {
    public static Map<String, Double> getExchangeRates(String filePath) {
        Yaml yaml = new Yaml();
        InputStream inputStream = YamlParser.class
                .getClassLoader()
                .getResourceAsStream(filePath);
        Map<String, Double> obj = (Map<String, Double>)yaml.load(inputStream);

        return obj;
    }



}
