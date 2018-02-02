package com.example.andrew.myapplication.root;

import android.app.Application;

import com.example.andrew.myapplication.login.LoginModule;

/**
 * Created by andrew on 2/1/18.
 */

public class App extends Application {

    public ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
