/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public abstract class Mobiles {
    private String brand;
    private double cost;

    public Mobiles(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Mobiles{" + "brand=" + brand + ", cost=" + cost + '}';
    }
    
    public abstract double finalBilling();
}
