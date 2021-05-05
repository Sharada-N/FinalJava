/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sharada Devi Noothalapati");
        System.out.println("Final Exam Question 12" + "\n"
                + "***********************************************");
        ArrayList<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee(12, "Lara", 5678.90);
        Employee emp2 = new Employee(10, "Williams", 1234.78);
        Employee emp3 = new Employee(20, "Sara", 543.90);
        Employee emp4 = new Employee(6, "James", 9876.90);
        Employee emp5 = new Employee(30, "Marla", 23456.90);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        System.out.println("************Original List**************");
        for (Employee empFor : empList) {
            System.out.println(empFor);
        }
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                Integer o1 = e1.getEmpId();
                Integer o2 = e2.getEmpId();
                if (o1.compareTo(o2) == 0) {
                    return o1.compareTo(o2);
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        System.out.println("************Sorted List**************");
        for (Employee sortedList : empList) {
            System.out.println(sortedList);
        }

    }

}
