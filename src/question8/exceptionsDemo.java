/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class exceptionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 8" + "\n"
                + "***********************************************");
        int[] listInt = new int[10];
        try {
            for (int i = 0; i <= listInt.length; i++) {
                listInt[i] = i * 9;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
