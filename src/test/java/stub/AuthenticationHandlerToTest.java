package stub;

import edu.umflix.authenticationhandler.exceptions.InvalidUserException;
import edu.umflix.authenticationhandler.impl.AuthenticationHandlerImpl;
import edu.umflix.model.Role;
import edu.umflix.model.User;
import edu.umflix.persistence.RoleDao;
import edu.umflix.persistence.UserDao;

/**
 *
 */
public class AuthenticationHandlerToTest extends AuthenticationHandlerImpl {

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

}
