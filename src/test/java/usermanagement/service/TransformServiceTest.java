package usermanagement.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import usermanagement.entity.Person;

@RunWith(MockitoJUnitRunner.class)
public class TransformServiceTest {

    @InjectMocks
    private TransformService transformService;

    @Test
    public void toUserDomainTest() {
        Person person = new Person();
        person.setPersonId(10);
        person.setCompanyName("company");
        person.setfName("fName");
        person.setlName("lName");
        User user = transformService.toUserDomain(person);
        assertEquals(10, user.getUserId().intValue());
        assertEquals("company", user.getCompanyName());
        assertEquals("fName", user.getFirstName());
        assertEquals("lName", user.getLastName());
    }

    @Test
    public void toUserEntityTest() {
        User user = new User();
        user.setUserId(10);
        user.setCompanyName("company");
        user.setFirstName("fName");
        user.setLastName("lName");
        Person person = transformService.toUserEntity(user);
        assertEquals(10, person.getPersonId());
        assertEquals("company", person.getCompanyName());
        assertEquals("fName", person.getfName());
        assertEquals("lName", person.getlName());
    }
}
