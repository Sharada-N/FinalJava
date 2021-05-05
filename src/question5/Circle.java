/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Circle {

    private double radius;
    private static double PIE = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circleArea() {
        return PIE * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

}
