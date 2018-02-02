package com.example.andrew.myapplication.login;

/**
 * Created by andrew on 2/1/18.
 */

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user = new User("Fox", "Mulder");
            user.setId(0);
            return user;
        }

        return null;
    }

    @Override
    public void saveUser(User user) {

        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }
}
