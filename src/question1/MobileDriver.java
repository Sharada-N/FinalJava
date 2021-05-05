/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class MobileDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 1" + "\n"
                + "***********************************************");
        Mobiles mobiles = new OnePlus("8T", "OnePlus", 1000.0);
        System.out.println("final billing cost: $" + mobiles.finalBilling());
    }

}
