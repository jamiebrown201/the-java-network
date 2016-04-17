
package socialnetwork;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest {
    
    
    User testUser;
    
    @Before
    public void setUp() {
       testUser = new User("test");
       System.out.println("@Before: setUp");
    }
    

    @Test
    public void getName() {
        System.out.println("username");
        assertEquals("test", testUser.getName());
    }
    
}
