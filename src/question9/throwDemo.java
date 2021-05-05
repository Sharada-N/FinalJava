/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class throwDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 9" + "\n"
                + "***********************************************");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any int number: ");
            int number = scan.nextInt();
            if (number > 10) {
                throw new Exception("Exception number greater than 10");
            } else {
                throw new Exception("Exception in the else block");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
