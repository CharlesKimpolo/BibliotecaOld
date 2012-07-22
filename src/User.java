import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;

public class User {
    String username;
    String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String displayUsername() {
        return "Username: " + username;
    }

    public boolean authenticateUser() {
        if (!(this.username.equals(username) && this.password.equals(password))) return false;
        return true;
    }
}

