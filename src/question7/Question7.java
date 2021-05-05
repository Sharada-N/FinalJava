/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 7" + "\n"
                + "***********************************************");
        Scanner scan = new Scanner(System.in);
        int[] randomList = new int[100];
        int element = 0;
        for (int i = 0; i < randomList.length; i++) {
            //int num = (int)Math.random();
            randomList[i] = (int) (Math.random() * 100);
        }
        System.out.print("Enter the index of the array: ");
        int index = scan.nextInt();
        if (index < 100) {
            for (int i = 0; i < randomList.length; i++) {
                element = randomList[index];
            }
            System.out.println("Element at index " + index + " is " + element);
        } else {
            System.out.println("Out of Bounds.");
        }
        scan.close();
    }

}
