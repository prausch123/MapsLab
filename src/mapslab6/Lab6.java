/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab6;

import common.Employee;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Peter
 */
public class Lab6 {
    
    public static void main(String[] args) {
        Map<Employee, String> tree = new TreeMap<Employee, String>(new EmployeeByLastName());
        
        Employee e1 = new Employee(1, "Rausch", "Peter", "333-33-3333");
        Employee e2 = new Employee(2, "John", "Doe", "444-44-4444");
        Employee e3 = new Employee(3, "Jane", "Doe", "555-55-5555");
        Employee e4 = new Employee(2, "Joe", "Schmoe", "222-22-2222");
        
        tree.put(e1, e1.getLastName());
        tree.put(e2, e2.getLastName());
        tree.put(e3, e3.getLastName());
        tree.put(e4, e4.getLastName());
        
        for(Employee e : tree.keySet()) {
            System.out.println(e);
        }
    }
}
