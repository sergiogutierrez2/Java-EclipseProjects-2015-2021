// Student.java: Print the first name, last name, and an ID in special sorted formats: (1-unsorted, 2-sorted alphabetically by first name, 3-and sorted by id number).
package edu.princeton.cs.algs4;
import edu.princeton.cs.algs4.*;
import java.lang.Object;
import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private String lastName;
    private int id;
    
    public Student(String lastName, String name, int id){
        this.lastName = lastName;
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    
    public String toString() {
    	return name + " " + lastName + " " + id;
    }
    
    public int compareTo(Student st) {
    	return this.name.compareTo(st.name);
    }
    
    public static class lastNameOrder implements Comparator<Student>{
        public int compare(Student thisStudent, Student otherStudent) {
        	return (thisStudent.id < otherStudent.id) ? -1 : 1;
        }
    }
    
    public static void main(String arg[]){
        Student []student = new Student[6];
        student[0] = new Student("Tolaymat", "Samy", 2);
        student[1] = new Student("Liu", "Linxin", 6);
        student[2] = new Student("Kim", "Jung S.", 9);
        student[3] = new Student("Le", "Kimberly N.", 1);
        student[4] = new Student("Gonzalez", "Robert A.", 8);
        student[5] = new Student("Roscoe", "Sarah R.", 4);
        
        //CHANGE FOR LOOP TO ENHANCED LOOP
        System.out.println("");
        for(Student i: student) {
        System.out.println("Unsorted: "+ i);
        }
       
        System.out.println("");
        Arrays.sort(student);
        for(Student i: student) {
        	 System.out.println("Sorted by first name: "+ i);
        }
       
        System.out.println("");
        Arrays.sort(student, new Student.lastNameOrder());
        for(Student i: student) {
        	 System.out.println("Sorted by id: "+i);
        }
    }
}