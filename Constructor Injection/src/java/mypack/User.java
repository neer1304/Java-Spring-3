/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author Admin
 */
public class User {

 private String name;

private int age;

private String country;


User(String name, int age, String country)
{
this.name=name;
this.age=age;
this.country=country;
}

public String toString() {
return name + " is " + age + " years old, living in " + country;
}

}
