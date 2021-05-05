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
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 05" + "\n"
                + "***********************************************");
        ComparableCircle compare = new ComparableCircle(12.0);
        ComparableCircle compare2 = new ComparableCircle(10.0);
        int compareVALUE = compare.compareTo(compare2);
        if (compareVALUE == -1) {
            System.out.println("Area of Largest circle with " + compare2.getRadiusOfCircle()
                    + " radius is " + Math.round(compare2.getAreaOfCircle() * 100.0) / 100.0);
        } else if (compareVALUE == 1) {
            System.out.println("Area of Largest circle with " + compare.getRadiusOfCircle()
                    + " radius is " + Math.round(compare.getAreaOfCircle() * 100.0) / 100.0);
        } else if (compareVALUE == 0) {
            System.out.println("Two Circles area of equal radius and equla area");
        }
    }

}
