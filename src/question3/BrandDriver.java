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
public class BrandDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 3" + "\n"
                + "***********************************************");
        Handbags hb = new Handbags(3, "Black", "Guess", "high", 1000);
        Brand brand = (Brand) hb; //UpCasting
        System.out.println("UpCasting: ");
        System.out.println(brand.toString());
        Brand downcasting = new Handbags(2, "Red", "new Brand", "low", 300);
        Handbags downHand = (Handbags) downcasting; //Downcasting
        System.out.println("DownCasting: ");
        System.out.println(downHand.totalPrice());

    }

}
