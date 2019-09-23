package com.aaron.retrofitrxjavedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aaron.retrofitlibrary.net.RetrofitClientDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RetrofitClientDemo.getInstance(getApplicationContext()).getService(ApiService.class)
//                .login(name,password)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);
    }
}
