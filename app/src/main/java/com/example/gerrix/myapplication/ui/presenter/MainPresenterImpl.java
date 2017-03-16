package com.example.gerrix.myapplication.ui.presenter;

import android.content.Context;


import com.example.gerrix.myapplication.interactor.MainInteractor;
import com.example.gerrix.myapplication.ui.activity.MainView;

import javax.inject.Inject;


public class MainPresenterImpl implements MainPresenter {
    private MainView mainView;
    private MainInteractor mainInteractor;

    @Inject
    public MainPresenterImpl(MainView mainView, MainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }


}
