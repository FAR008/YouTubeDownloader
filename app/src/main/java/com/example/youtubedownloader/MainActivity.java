package com.example.youtubedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.download);
        data=findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=data.getText().toString();
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
            }
        });
    }
}