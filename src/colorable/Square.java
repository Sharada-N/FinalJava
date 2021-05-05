/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorable;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    public double squareArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        if (side > 0) {
            System.out.println("Color all four sides of a Square");
        } else {
            System.out.println("Side of a Square is 0");
        }
    }

}
