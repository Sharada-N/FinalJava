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
public class SquareDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 2" + "\n"
                + "***********************************************");
        Colorable col1 = new Square(12);
        Colorable col2 = new Square(24);
        Colorable col3 = new Square(36);
        Colorable col4 = new Square(48);
        Colorable col5 = new Square(60);
        GeometricObject[] obj = new GeometricObject[5];
        obj[0] = (GeometricObject) col1;
        obj[1] = (GeometricObject) col2;
        obj[2] = (GeometricObject) col3;
        obj[3] = (GeometricObject) col4;
        obj[4] = (GeometricObject) col5;

        for (GeometricObject geoObjFor : obj) {
            System.out.println("Area of Square is " + geoObjFor.squareArea());
            geoObjFor.howToColor();
        }

    }

}
