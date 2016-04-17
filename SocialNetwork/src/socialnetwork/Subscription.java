package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;

public class Subscription {

    HashMap<String, ArrayList<String>> subscriptions;

    public Subscription() {
        subscriptions = new HashMap<String, ArrayList<String>>();
    }

    public void newSubscription(String currentUserName, String name) {
        if (subscriptions.get(name) == null) {
            subscriptions.put(name, new ArrayList<String>());
        }
        subscriptions.get(name).add(currentUserName);
    }



    public String readSubscriptions(String name) {
        String aggregatedSubscribers = "";
        for (int i = 0; i < subscriptions.get(name).size(); i++) {
            int postNumber = (i + 1);
            aggregatedSubscribers = aggregatedSubscribers + subscriptions.get(name).get(i) + "\n";
        }
        return aggregatedSubscribers;
    }
}
