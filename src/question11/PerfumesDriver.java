/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Sharaada Devi Noothalapati
 */
public class PerfumesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 11" + "\n"
                + "***********************************************");
        //Created object for Perfumes Class
        Perfumes p1 = new Perfumes("Spring", 15, "Rose");
        //Created object for Perfumes Class
        Perfumes p2 = new Perfumes("Jimmy Choo", 65, "Cherry");
        //Created object for Perfumes Class
        Perfumes p3 = new Perfumes("Ck", 15, "Rose");
        System.out.println("******************Equals Method******************");
        //comparing p1 and p2 objects attributes with equals method
        System.out.println(p1.equals(p2));
        //comparing p2 and p3 objects attributes with equals method
        System.out.println(p2.equals(p3));
        //comparing p3 and p1 objects attributes with equals method
        System.out.println(p3.equals(p1));
        System.out.println("******************HashCode Method******************");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }

}
