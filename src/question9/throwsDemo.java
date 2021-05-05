/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapti
 */
public class throwsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IndexOutOfBoundsException, ArithmeticException {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 9" + "\n"
                + "***********************************************");
        try {
            Scanner scan = new Scanner(new File("file.txt"));
            while (scan.hasNext()) {
                int a = scan.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
