package com.example.gerrix.myapplication.di;

import android.app.Application;
import android.content.Context;

public class MyAplication extends Application {
    private static AppComponent appComponent;
    private static MyAplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initAppComponents();
    }

    public static MyAplication get(Context context) {
        return (MyAplication) context.getApplicationContext();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }


    public void initAppComponents() {
        appComponent =
                DaggerAppComponent.builder()
                        .appModule(new AppModule(this))
                        .build();

    }


}
