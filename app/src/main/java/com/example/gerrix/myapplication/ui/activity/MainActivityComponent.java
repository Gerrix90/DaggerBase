package com.example.gerrix.myapplication.ui.activity;



import com.example.gerrix.myapplication.di.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules = {MainActivityModule.class}
)
public interface MainActivityComponent {

    void inject(MainActivity activity);
}

