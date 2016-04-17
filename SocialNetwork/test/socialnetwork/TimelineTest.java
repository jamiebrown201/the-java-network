package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class TimelineTest {

    Timeline timeline;
    String name;
    HashMap<String,ArrayList<String>> fake; 

    @Before
    public void setUp() {
        timeline = new Timeline();
    }

    @Test
    public void testInit() {
        fake = new HashMap<String,ArrayList<String>>();
        assertEquals(fake, timeline.posts);
    }

    @Test
    public void testNewPost() {
        timeline.newPost("test new post", "testing");
        assertEquals("test new post", timeline.posts.get("testing").get(0));
    }

    @Test
    public void testReadPost() {
        timeline.newPost("test new post", "testing");
        timeline.newPost("test new post again", "testing");
        assertEquals("Post 1: test new post\nPost 2: test new post again\n", timeline.readPosts("testing"));
    }

}
