/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

/**
 *
 * @author Admin
 */
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import domain.User;
import service.UserService;

@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {

	private UserService userService;

	public UserController()	{
		setCommandClass(User.class);
		setCommandName("user");
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User) command;
		userService.add(user);
		return new ModelAndView("userSuccess","user",user);
	}

}
