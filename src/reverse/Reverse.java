/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author gagan
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
      
      Student[] studentList = new Student[3]; 
      
      for(int i=0;i< studentList.length;i++)
      {
          System.out.println("Enter a student name"); 
          String studentName=sc.nextLine(); 
          Student student= new Student(studentName);
          studentList[i]=student; 
      }
    }
    
}
