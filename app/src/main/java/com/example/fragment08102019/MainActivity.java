package com.example.fragment08102019;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.linearLayoutContainer,androidFragment);
        fragmentTransaction.commit();

        runOnUiThread(new Thread(new Runnable() {
            @Override
            public void run() {
                if(fragmentManager.executePendingTransactions()){
                    Log.d("BBB","Xu ly xong");
                }else{
                    Log.d("BBB","Chua xong");
                    this.run();
                }
            }
        }));

    }
}
