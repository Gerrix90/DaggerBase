package com.example.gerrix.myapplication.ui.activity;



import com.example.gerrix.myapplication.di.ActivityScope;
import com.example.gerrix.myapplication.interactor.MainInteractor;
import com.example.gerrix.myapplication.interactor.MainInteractorImpl;
import com.example.gerrix.myapplication.ui.presenter.MainPresenter;
import com.example.gerrix.myapplication.ui.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    public final MainView view;



    public MainActivityModule(MainView view) {
        this.view = view;

    }

    @Provides
    @ActivityScope
    MainView provideMainView() {
        return this.view;
    }


    @Provides
    @ActivityScope
    MainInteractor provideMainInteractor(MainInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @ActivityScope
    MainPresenter provideMainPresenter(MainPresenterImpl presenter) {
        return presenter;
    }
}
