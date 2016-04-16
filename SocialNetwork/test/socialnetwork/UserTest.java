/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jamie
 */
public class UserTest {
    
    
    User testUser;
    
    @Before
    public void setUp() {
       testUser = new User("test");
       System.out.println("@Before: setUp");
    }
    

    /**
     * Test of main method, of class User.
     */
    @Test
    public void username() {
        System.out.println("username");
        assertEquals("test", testUser.getName());
    }
    
}
