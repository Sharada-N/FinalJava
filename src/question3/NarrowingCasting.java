/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class NarrowingCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 3-Narrowing Casting" + "\n"
                + "***********************************************");
        double castingNum = 11.68;
        int num = (int) castingNum;
        System.out.println("Before Casting: " + castingNum);
        System.out.println("After Narrowing casting double datatype to int: " + num);
    }

}
