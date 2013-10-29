/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab6;

import common.Employee;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Peter
 */
public class EmployeeByLastName implements Comparator{
    private String lastName;
    private String firstName;
    private String ssn;

    public EmployeeByLastName(){}
    
    public EmployeeByLastName(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeByLastName other = (EmployeeByLastName) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    /*
    @Override
    public int compareTo(Object o) {
        EmployeeByLastName other = (EmployeeByLastName)o;
        
        return new CompareToBuilder()
               .append(this.ssn, other.ssn)
               .toComparison();
    }
    * */

    @Override
    public int compare(Object o1, Object o2) {
         /*EmployeeByLastName other1 = (EmployeeByLastName)o1;
         EmployeeByLastName other2 = (EmployeeByLastName)o2;
        
        return new CompareToBuilder()
               .append(other1.getLastName(), other2.getLastName())
               .toComparison();
               * */
        Employee other1 = (Employee)o1;
        Employee other2 = (Employee)o2;
        return other1.getLastName().compareTo(other2.getLastName());
    }
}
