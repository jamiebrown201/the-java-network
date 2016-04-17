
package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SubscriptionTest {
    
    Subscription subscription;
    String name;
    HashMap<String,ArrayList<String>> fake; 

    @Before
    public void setUp() {
        subscription = new Subscription();
    }

    @Test
    public void testInit() {
        fake = new HashMap<String,ArrayList<String>>();
        assertEquals(fake, subscription.subscriptions);
    }

    @Test
    public void newSubscriptions() {
        subscription.newSubscription("test1", "test2");
        assertEquals("test1", subscription.subscriptions.get("test2").get(0));
    }
//
    @Test
    public void readSubscriptions() {
        subscription.newSubscription("test1", "test2");
        subscription.newSubscription("test3", "test2");
        assertEquals("test1\ntest3\n", subscription.readSubscriptions("test2"));
    }
    
}
