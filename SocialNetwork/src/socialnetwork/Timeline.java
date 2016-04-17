
package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;

public class Timeline {
    
    String name;
    HashMap<String,ArrayList<String>> posts; 
    
    public Timeline(String customName) {
        posts = new HashMap<String,ArrayList<String>>();
    }
    
    
    public void newPost(String message, String name){
        if (posts.get(name) == null) posts.put(name, new ArrayList<String>());
        posts.get(name).add(message);
    }

    public String readPosts(String name) {
        String aggregatedPosts = "";
        for(int i =0; i < posts.get(name).size(); i++){
          int postNumber = (i + 1);
          aggregatedPosts = aggregatedPosts + "Post " + Integer.toString(postNumber) 
                            + ": "  + posts.get(name).get(i) + "\n";
        }
        return aggregatedPosts;
    }
}
