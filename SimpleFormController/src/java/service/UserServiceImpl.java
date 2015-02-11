/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.User;

/**
 *
 * @author Admin
 */

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here.
		System.out.println("User added successfully");

	}

}

