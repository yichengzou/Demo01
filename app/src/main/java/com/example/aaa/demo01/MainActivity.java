package com.example.aaa.demo01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btncall, btnend;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncall = (Button) findViewById(R.id.call);
        btnend = (Button) findViewById(R.id.endcall);
        btncall.setOnClickListener(this);
        btnend.setOnClickListener(this);
        textView= (TextView) findViewById(R.id.textcontent);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call:
                btncall.setBackgroundResource(R.drawable.ic_launcher);
                textView.setText("======有电话=====");
                textView.setBackgroundResource(R.drawable.ic_launcher);

                break;
            case R.id.endcall:
                btnend.setBackgroundResource(R.drawable.ic_launcher);
                textView.setText("============电话已经挂断======");
                textView.setBackgroundResource(R.drawable.ic_launcher);
                break;
        }
    }
}
