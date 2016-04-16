/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;


public class User {
    
    String name;
    
    public User(String customName){
        name = customName;
    }
    
    public String getName(){
        return this.name;
    }
    
}
