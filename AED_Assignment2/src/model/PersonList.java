/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shrey
 */
public class PersonList {
    
    ArrayList<Person> userList;

    public PersonList() {
        this.userList = new ArrayList<Person>();
    }

    public ArrayList<Person> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<Person> userList) {
        this.userList = userList;
    }

    
    public Person addUser()
    {
        Person user = new Person();
        userList.add(user);
        System.out.println("User"+user);
        return user;
    }

}
    
