package com.example.sivakrishna.mvp2.root;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by siva krishna on 9/23/2017.
 */
@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application){
        this.application=application;
    }
    @Provides
    @Singleton
    public Application provideContext(){
        return application;
    }
}
