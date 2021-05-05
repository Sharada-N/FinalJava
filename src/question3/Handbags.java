/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Handbags extends Brand {

    private int size;
    private String color;

    public Handbags(int size, String color, String name, String qualityLevel, int cost) {
        super(name, qualityLevel, cost);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double totalPrice() {
        double amount;
        if (super.getQualityLevel().equalsIgnoreCase("high")) {
            return amount = super.getCost() + 20;
        } else if (super.getQualityLevel().equalsIgnoreCase("medium")) {
            return amount = super.getCost() + 10;
        } else {
            return amount = super.getCost() + 5;
        }
    }

    @Override
    public String toString() {
        return "Handbags{" + "size=" + size + ", color=" + color + '}';
    }

}
