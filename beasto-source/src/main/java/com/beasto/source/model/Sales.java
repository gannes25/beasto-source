package com.beasto.source.model;

import lombok.Data;

@Data
public class Sales {
    private int saleId;
    private String dateOfSale;
    private String typeOfVehicle;
    private int quantity;
    private String typeOfFuel;
    private String colour;
}
