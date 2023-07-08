package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    private SharedPrefManager sharedPrefManager;
    private EditText etUsername, etPassword;
    private Button btnLogin;
    private ProgressBar pbLogin;
    private ImageView icLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPrefManager = new SharedPrefManager(this);

        if (sharedPrefManager.getIsLogin()){
            // kondisi jika user sudah login
            startHomeUI();
        }
    }

    public void startHomeUI() {
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);
        finishAffinity();
    }
}