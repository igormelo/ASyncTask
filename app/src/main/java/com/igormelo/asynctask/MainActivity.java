package com.igormelo.asynctask;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends Activity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        textView = (EditText) findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             MyTask myTask = new MyTask(MainActivity.this,textView,button);
                myTask.execute();
                button.setEnabled(false);
            }
        });
    }



}
