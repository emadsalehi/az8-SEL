package usermanagement.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserNotFoundExceptionTest {

    @Test
    public void test_userNotFoundException_constructor() {
        UserNotFoundException exception = new UserNotFoundException("message", 10);
        assertEquals(10, exception.getUserId().intValue());
    }
}
