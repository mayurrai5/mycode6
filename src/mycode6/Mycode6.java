/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode6;

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;

class Employee {
  int empId;

Employee(int count) {
  this.empId = count;
 }

public String toString() {
  return "Employee id - " + empId;
 }
}

public class Mycode6 {
public static void main(String[] args) {
  ArrayList<Employee> originalEmployeeList = new ArrayList<>(); // Line n1
  originalEmployeeList.add(new Employee(101)); // Line n2

  ArrayList<Employee> clonedEmployeeList = (ArrayList<Employee>)       originalEmployeeList.clone();
  clonedEmployeeList.get(0).empId = 50;

  System.out.println(originalEmployeeList);
  }
}