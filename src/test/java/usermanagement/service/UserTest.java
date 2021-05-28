package usermanagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {

    @Test
    public void equalsTest() {
        User user = new User();
        user.setUserId(10);
        user.setCompanyName("company");
        user.setFirstName("fName");
        user.setLastName("lName");
        User user1 = new User();
        user1.setUserId(10);
        user1.setCompanyName("company1");
        user1.setFirstName("fName1");
        user1.setLastName("lName1");
        assertTrue(user.equals(user1));
    }
}
