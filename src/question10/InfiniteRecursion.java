/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 10" + "\n"
                + "***********************************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number for Recursion: ");
        int value = scan.nextInt();
        calcvalue(value);
    }

    public static void calcvalue(int value) {
        if (value == 0) {
            System.out.println();
        } else {
            System.out.println(value);
            value += 1;
            calcvalue(value);
        }
    }

}
