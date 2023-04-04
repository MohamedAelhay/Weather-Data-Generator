package com.example.weather.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CountryEnum {

    EGYPT(1L, "egypt"),

    UAE(2L, "united arab"),

    KSA(3L, "Kingdom of Saudi Arabia"),

    KUWAIT(4L, "Kuwait"),

    QATAR(5L, "Qatar"),

    OMAN(6L, "Oman"),

    LEBANON(7L, "Lebanon"),

    JORDON(8L, "Jordon"),

    SUDAN(9L, "Sudan"),

    SYRIA(10L, "syria");

    public final Long id;

    public final String countryName;

}
