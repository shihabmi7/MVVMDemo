package me.shihab.mvvmdemo.model;

public interface LoginResultCallback {
    void onSucccess(String message);
    void onError(String message);
}
