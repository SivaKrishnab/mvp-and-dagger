package com.example.sivakrishna.mvp2.root;

import com.example.sivakrishna.mvp2.Login.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by siva krishna on 9/23/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
