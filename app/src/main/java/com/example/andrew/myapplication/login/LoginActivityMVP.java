package com.example.andrew.myapplication.login;

/**
 * Created by andrew on 2/1/18.
 */

public interface LoginActivityMVP {

    interface View {
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();

        void setFirstName(String firstName);
        void setLastName(String lastName);

    }

    interface Presenter {
        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    interface Model {

        void createUser(String fistName, String lastName);

        User getUser();

    }
}
