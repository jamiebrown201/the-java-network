
package socialnetwork;


import java.util.HashMap;
import java.util.Map;


public class User {
    
    String name;
    Timeline timeline;
    Subscription subscription;
    
    
    public User(String customName){
        name = customName;
        timeline = new Timeline(customName);
        subscription = new Subscription(customName);
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public void postTimeline(String message , String name){
        timeline.newPost(message, name);
    }
    
    public String readTimeline(String name){
        return timeline.readPosts(name);
    }

    public void subscribe(String currentUserName, String name) {
        subscription.newSubscription(currentUserName, name);
    }
    
    public String subscribers(String name) {
        return subscription.readSubscriptions(name);
    }
    
}
