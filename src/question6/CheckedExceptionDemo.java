/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class CheckedExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 6" + "\n"
                + "***********************************************");
        try {
            Scanner scan = new Scanner(new File("inputFile.txt"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
