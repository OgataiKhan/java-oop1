package org.shop;

public class Main {
    public static void main(String[] args) {
        Product hurdyGurdy = new Product("Hurdy Gurdy", "This is a musical instrument", "499.99", "0.22");

        System.out.println(hurdyGurdy);
        System.out.println("Code: " + hurdyGurdy.getCode());
        System.out.println("Product name: " + hurdyGurdy.getName());
        System.out.println("Full product name: " + hurdyGurdy.getFullName());
        System.out.println("Product description: " + hurdyGurdy.getDescription());
        System.out.println("Base price: " + hurdyGurdy.getPrice());
        System.out.println("VAT: " + hurdyGurdy.getVat());
        System.out.println("Price with VAT: " + hurdyGurdy.getVatPrice());

        hurdyGurdy.setName("Panda");
        hurdyGurdy.setDescription("Too bad, this is no longer a Hurdy Gurdy, it is now a panda.");
        hurdyGurdy.setPrice("199.90");
        hurdyGurdy.setVat("0.50");

        System.out.println(hurdyGurdy);
    }
}
