/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class RecursiveDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 10" + "\n"
                + "***********************************************");
        int number = 10;

        elementDisplay(number);
    }

    public static void elementDisplay(int number) {
        if (number == 1) {
            System.out.println("number " + number);
        } else {
            int result = number - 1;
            elementDisplay(result);
            System.out.println("number in else part: " + result);
        }

    }

}
