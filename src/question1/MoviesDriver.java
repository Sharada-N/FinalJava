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
public class MoviesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 1" + "\n"
                + "***********************************************");
        Tickets ticket = new Tickets("Avengers", "AM");
        CollectionObj colObj = new CollectionObj(998.45, 90);
        System.out.println("Tickets Booked for " + ticket.ticketBooking() + " at " + ticket.getLocation() + ".");
        System.out.println("Total Collections for " + colObj.getNoOfDays() + " days is $" + colObj.collections());
    }

}
