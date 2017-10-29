package com.androiddev.loginmvpdemo.loginmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.androiddev.loginmvpdemo.R;

public class LoginActivity extends AppCompatActivity implements LoginView{


    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if(presenter==null){
            presenter= new LoginPresenterImpl(this);
        }
    }

    @Override
    public void showValidationError() {
        Toast.makeText(this, "Please enter valid username and password!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {

        Toast.makeText(this, "You are succussfully logged in!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Invalid login credintails!", Toast.LENGTH_SHORT).show();

    }
}
