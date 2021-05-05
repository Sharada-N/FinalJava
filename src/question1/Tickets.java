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
public class Tickets implements Movies, Location {

    private String name;
    private String time;

    public Tickets(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "tickets{" + "name=" + name + ", time=" + time + '}';
    }

    @Override
    public String ticketBooking() {
        if (time.equalsIgnoreCase("AM")) {
            return "morning Show";
        } else if (time.equalsIgnoreCase("PM")) {
            return "Noon Show";
        } else {
            return "Please enter s AM or PM";
        }
    }

    @Override
    public double collections() {
        return 0.0;
    }

    @Override
    public String getLocation() {
        return "Hyderabad";
    }

}
