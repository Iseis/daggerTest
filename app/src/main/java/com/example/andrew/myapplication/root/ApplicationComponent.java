package com.example.andrew.myapplication.root;

import com.example.andrew.myapplication.login.LoginActivity;
import com.example.andrew.myapplication.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by andrew on 2/1/18.
 */

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
