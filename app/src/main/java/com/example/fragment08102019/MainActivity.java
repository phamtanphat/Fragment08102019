package com.example.fragment08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = new Person();
        String launage = person.getLanguage(ListPerson.AMERICAN);
        Log.d("BBB",launage);
    }
}
