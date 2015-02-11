/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

User user = (User)context.getBean("user");

System.out.println(user);

}

}
