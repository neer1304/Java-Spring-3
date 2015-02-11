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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old, living in " + country;
    }
    
}
