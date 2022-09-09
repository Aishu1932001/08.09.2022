/* Question - To camparing object values using equals method*/
 
package com.equals.demo;

public class StudentTest { 
    
    
    public static void main(String[] args) {			
        
        Student stu1 = new Student("Aishu", 06, "12th", "A", "Good");	
        
        Student stu2 = new Student("sandy", 04, "11th", "B", "Bad");	
        
        Student stu3 = new Student("Preethi", 05, "10th", "B", "Average");
        
        Student stu4 = new Student("Swetha", 06, "10th", "A", "Good");		
        
        System.out.println(stu1.equals(stu4));
        
        System.out.println(stu3.equals(stu2));
        
        System.out.println(stu2.equals(stu1));	
        
        System.out.println(stu1.equals(stu3));	
    
    } 
}
