package me.shihab.mvvmdemo.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import me.shihab.mvvmdemo.model.LoginResultCallback;

public class LoginVIewModelFactory
        extends ViewModelProvider.NewInstanceFactory {

    private LoginResultCallback loginResultCallback;

    public LoginVIewModelFactory(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        return (T) new LoginViewModel(loginResultCallback);
    }
}
