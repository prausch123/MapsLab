/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab5;

import common.Employee;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Peter
 */
public class Lab5 {
    
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
    
        Employee e1 = new Employee(1, "Rausch", "Peter", "333-33-3333");
        Employee e2 = new Employee(2, "John", "Doe", "444-44-4444");
        Employee e3 = new Employee(3, "Jane", "Doe", "555-55-5555");
        Employee e4 = new Employee(2, "John", "Doe", "444-44-4444");

        employees.put(e1.getEmpID(), e1);
        employees.put(e2.getEmpID(), e2);
        employees.put(e3.getEmpID(), e3);
        employees.put(e4.getEmpID(), e4);
        
        
    }

    
}
