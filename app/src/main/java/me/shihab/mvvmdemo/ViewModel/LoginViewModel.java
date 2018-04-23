package me.shihab.mvvmdemo.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import me.shihab.mvvmdemo.model.LoginResultCallback;
import me.shihab.mvvmdemo.model.User;

public class LoginViewModel
        extends ViewModel {
    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        this.user = new User();
    }


    public TextWatcher getEmailTextWatcher() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordWatcher() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                user.setPassword(s.toString());
            }
        };
    }

    public void onLoginClicked(View view) {

        if (user.isValid())
            loginResultCallback.onSucccess("Login Success");
        else
            loginResultCallback.onError("Login Error");
    }
}
