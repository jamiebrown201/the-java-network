
package socialnetwork;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TimelineTest {
    
    Timeline timeline;
    String name;
    
    @Before
    public void setUp() {
        timeline = new Timeline();
        timeline.newPost("test new post", "testing");
    }
    

    @Test
    public void testNewPost() {
        assertEquals("test new post", timeline.posts.get("testing").get(0));     
    }
    
    public void testReadPost() {
        assertEquals("test new post", timeline.readPosts("testing"));     
    }
    
}
