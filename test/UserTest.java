import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class UserTest {

    @Test
    public void shouldBeAbleToDisplayUserName() throws Exception {
        User user = new User("111-1111", "wmb");
        assertEquals("Username: 111-1111", user.displayUsername());
    }

    @Test
    public void shouldBeAbleToAuthenticateUser() throws Exception {
        User user = new User("username1", "1234");
        assertTrue(user.authenticateUser());
    }
}
