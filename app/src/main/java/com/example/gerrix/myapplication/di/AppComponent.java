package com.example.gerrix.myapplication.di;

import android.app.Application;


import com.example.gerrix.myapplication.ui.activity.MainActivityComponent;
import com.example.gerrix.myapplication.ui.activity.MainActivityModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ServiceModule.class})
public interface AppComponent {

    MainActivityComponent plus(MainActivityModule module);
    Application application();

}
