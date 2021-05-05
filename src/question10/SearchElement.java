/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class SearchElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 10" + "\n"
                + "***********************************************");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 15);
        }
        System.out.print("Enter any number for Searching in the List: ");
        int searchElement = scan.nextInt();
        searchElement(searchElement, arrayList);
    }

    public static void searchElement(int searchElement, ArrayList<Integer> arrayList) {

        if (arrayList.size() != 0) {
            if (arrayList.get(0) == searchElement) {
                System.out.println("Element found");
            } else {
                arrayList.remove(0);
                searchElement(searchElement, arrayList);
            }
        } else {
            System.out.println("length " + arrayList.size());
            System.out.println("Element not found");
        }

    }

}
