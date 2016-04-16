/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.util.Scanner;

/**
 *
 * @author Jamie
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press Y to create a user");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            String username = askUsername();
            User currentUser = new User(username);
            System.out.println(currentUser.getName());
        }
    }

    public static String askUsername() {
        System.out.println("What would you like your username to be?");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        return username;
    }

}
