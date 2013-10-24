/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab4;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Peter
 */
public class Lab4 {
        public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
                
        Employee e1 = new Employee(1, "Rausch", "Peter", "333-33-3333");
        Employee e2 = new Employee(2, "John", "Doe", "444-44-4444");
        Employee e3 = new Employee(3, "Jane", "Doe", "555-55-5555");
        Employee e4 = new Employee(2, "John", "Doe", "444-44-4444");
        
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        
        System.out.println("Size before duplicate removal: " + emp.size());
        
        Set<Employee> s = new HashSet<Employee>(emp);
        emp = new ArrayList<Employee>(s);
        
        System.out.println("Size after duplicate removal: " + emp.size());
        
        // Display 2nd Item
        Employee secondItem = (Employee)emp.get(2);
        System.out.println(secondItem + "\n");
        
        for(int i = 0; i > emp.size(); i++) {
            Employee eTemp = (Employee)emp.get(i);
            System.out.println(eTemp);
        }
    }
}
