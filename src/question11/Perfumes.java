/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Perfumes {

    /**
     * Declared all the required variables
     */
    private String brand;
    private int quantity;
    private String flavour;

    /**
     * Overloaded constructor
     *
     * @param brand
     * @param quantity
     * @param flavour
     */
    public Perfumes(String brand, int quantity, String flavour) {
        this.brand = brand;
        this.quantity = quantity;
        this.flavour = flavour;
    }

    /**
     * returns the brand name which is a String
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * returns the quantity which is int
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * returns the flavour which is a String
     *
     * @return
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * which returns the integer value
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 107 * hash + Objects.hashCode(this.brand);
        hash = 107 * hash + this.quantity;
        hash = 107 * hash + Objects.hashCode(this.flavour);
        return hash;
    }

    /**
     * returns the boolean value based on the conditions given. if both
     * quantities are same it returns true. If both the brands are not equal it
     * returns false. If both flavours are not equal it returns false.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perfumes other = (Perfumes) obj;
        if (this.quantity == other.quantity) {
            return true;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.flavour, other.flavour)) {
            return false;
        }
        return true;
    }

    /**
     * returns a String value with all the required attributes
     *
     * @return
     */
    @Override
    public String toString() {
        return "Perfumes{" + "brand=" + brand + ", quantity=" + quantity + ", flavour=" + flavour + '}';
    }

}
