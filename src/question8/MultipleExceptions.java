/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class MultipleExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 8" + "\n"
                + "***********************************************");
        try {
            Scanner scan = new Scanner(new File("input.txt"));
            int num1 = 70;
            int num2 = 0;
            System.out.println("Result: " + num1 / num2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
