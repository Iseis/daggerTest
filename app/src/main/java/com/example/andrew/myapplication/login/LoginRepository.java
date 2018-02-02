package com.example.andrew.myapplication.login;

/**
 * Created by andrew on 2/1/18.
 */

public interface LoginRepository {

     User getUser();

     void saveUser(User user);
}
