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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public double getAreaOfCircle() {
        return super.circleArea();
    }

    public double getRadiusOfCircle() {
        return super.getRadius();
    }

    @Override
    public int compareTo(Circle cir) {
        return Double.compare(this.circleArea(), cir.circleArea());
    }

}
