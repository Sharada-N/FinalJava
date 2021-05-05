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
public class CollectionObj implements Movies{
    
    private double cost;
    private int noOfDays;

    public CollectionObj(double cost, int noOfDays) {
        this.cost = cost;
        this.noOfDays = noOfDays;
    }

    public double getCost() {
        return cost;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    @Override
    public String toString() {
        return "collectionObj{" + "cost=" + cost + ", noOfDays=" + noOfDays + '}';
    }
    
    @Override
    public String ticketBooking() {
        return "";
    }

    @Override
    public double collections() {
        return cost*noOfDays;
    }
    
}
