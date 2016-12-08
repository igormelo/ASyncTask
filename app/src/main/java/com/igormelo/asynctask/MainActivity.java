package com.igormelo.asynctask;

import android.app.ProgressDialog;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ImageView imagem;
    private Button button;
    private EditText endereco;
    private ProgressDialog load;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = (ImageView) findViewById(R.id.imageView);
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
