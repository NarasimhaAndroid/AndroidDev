package com.androiddev.loginmvpdemo.loginmvp;

import android.text.TextUtils;

/**
 * Created by narasimhareddy on 29/10/17.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView mLoginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView = loginView;

    }


    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            mLoginView.showValidationError();
        } else {
            if (username.equals("admin") && password.equals("admin")) {
                mLoginView.loginSuccess();
            } else {
                mLoginView.loginError();
            }

        }
    }
}