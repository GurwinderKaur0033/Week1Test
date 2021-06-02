/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author gagan
 */
public class Student {
    private String name; 
   private int id; 

    public Student(String name) {
        this.name = name;
        this.id= 123;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
