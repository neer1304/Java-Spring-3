/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Community;
import domain.Country;
import domain.User;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserService {

	public void add(User user);
	public List<Country> getAllCountries();
	public List<Community> getAllCommunities();
}
