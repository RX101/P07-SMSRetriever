package com.example.a15041867.p07_smsretriever;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment fNum = new FragmentNumber();
        ft.replace(R.id.frameNum, fNum);

        Fragment fWord = new FragmentWord();
        ft.replace(R.id.frameWord, fWord);

        ft.commit();
    }
}
