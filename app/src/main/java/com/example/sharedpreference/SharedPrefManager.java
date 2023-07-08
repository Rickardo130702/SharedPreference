package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefManager (Context context){
        sharedPreferences =context.getSharedPreferences("com.example.sharedpreference", context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setAsDefaultValue();
    }

    private void setAsDefaultValue() {
        setUsername("Admin");
        setPassowrd("12345678");
    }


    private void setUsername(String admin) {
        editor.putString("sp-Username", admin);
        editor.commit();
    }

    private void setPassowrd(String passowrd) {
        editor.putString("sp_Pasword", passowrd);
        editor.commit();
    }

    public void saveIsLogin(Boolean value){
        editor.putBoolean("sp_isLogin",value);
        editor.commit();
    }

//    mendapatkan value
    public String getUsername(){
        return sharedPreferences.getString("sp-Username", "");
    }

    public String getPassword(){
        return sharedPreferences.getString("sp_Pasword", "");
    }
    public boolean getIsLogin(){
        return sharedPreferences.getBoolean("sp_isLogin", false);

    }

}
