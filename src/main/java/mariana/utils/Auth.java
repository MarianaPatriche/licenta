package mariana.utils;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by mariana on 17.03.2016.
 */
public class Auth {

	public static String userLoggedIn() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
}
