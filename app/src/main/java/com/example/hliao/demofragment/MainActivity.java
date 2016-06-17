package com.example.hliao.demofragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {

    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = (Button) findViewById(R.id.btn_control);
        mBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fgm = new CListviewFm();
                FragmentManager FM = getFragmentManager();
                android.app.FragmentTransaction FT = FM.beginTransaction();

               // FT.add(R.id.rl_container, fgm,"list");
                FT.replace(R.id.rl_container,fgm);
                FT.addToBackStack(null);
                FT.commit();
            }
        });
    }
    }
