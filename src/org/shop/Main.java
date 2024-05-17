package org.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product hurdyGurdy = new Product("Hurdy Gurdy", "This is a musical instrument", new BigDecimal("499.99"), new BigDecimal("0.22"));

        System.out.println(hurdyGurdy);
        System.out.println("Code: " + hurdyGurdy.getCode());
        System.out.println("Price with VAT: " + hurdyGurdy.getVatPrice());
        System.out.println("Full product name: " + hurdyGurdy.getFullName());
    }
}
