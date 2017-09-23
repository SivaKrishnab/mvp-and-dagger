package com.example.sivakrishna.mvp2.root;

import android.app.Application;

/**
 * Created by siva krishna on 9/23/2017.
 */

public class App extends Application {
    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
