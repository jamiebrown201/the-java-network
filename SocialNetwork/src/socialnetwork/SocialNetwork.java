package socialnetwork;

import java.util.Scanner;

public class SocialNetwork {

    public static void main(String[] args) {
        User currentUser;
        String currentUserName;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java network...");
        currentUser = newUser();
        currentUserName = currentUser.getName();
        while (true) {
            System.out.println("Press M to post a message, V to view posts, L " + 
                               "to logout, S to subscribe to someones timeline," +
                               " SV to view your subscriptions and E to exit ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("M")) {
                System.out.println("What would you like to post?");
                String message = input.next();
                message += input.nextLine();
                currentUser.postTimeline(message, currentUserName);
            } else if (answer.equalsIgnoreCase("V")) {
                System.out.println("Whose posts would you like to see?");
                String name = input.next();
                System.out.println(currentUser.readTimeline(name));
            } else if (answer.equalsIgnoreCase("L")) {
                currentUser = newUser();
                currentUserName = currentUser.getName();
            } else if (answer.equalsIgnoreCase("S")) {
                System.out.println("Enter the name if the user you would like to sub:");
                String name = input.next();
                currentUser.subscribe(currentUserName, name);
            } else if (answer.equalsIgnoreCase("SV")) {
                System.out.println("Enter the name of the user whose subscriptions you would like to view:");
                String name = input.next();
                System.out.println(currentUser.subscribers(name));
            } else if (answer.equalsIgnoreCase("E")) {
                break;
            } else {
                System.out.println("Sorry that is not a recognised command");
            }
        }

    }

    public static User newUser() {
        String username = askUsername();
        User newUser = new User(username);
        return newUser;
    }

    public static String askUsername() {
        System.out.println("Who would you like to login as?");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        return username;
    }

}
