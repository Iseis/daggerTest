package com.example.andrew.myapplication.login;

/**
 * Created by andrew on 2/1/18.
 */

public class LoginActivityModel implements LoginActivityMVP.Model {

    private LoginRepository repository;

    public LoginActivityModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String fistName, String lastName) {
        repository.saveUser(new User(fistName, lastName));
    }

    @Override
    public User getUser() {

        return repository.getUser();
    }
}
