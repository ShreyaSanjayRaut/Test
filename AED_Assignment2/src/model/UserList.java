/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class UserList {
    
    public ArrayList<Person> userList = new ArrayList<>();
    
    public void addEnabledUsers(Person person){
        userList.add(person);
    }
    
    public ArrayList<Person> getUserList() {
        return userList;
    }
    
}
