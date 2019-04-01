package com.example.inclassassignment09_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show();
    }

public void Welcome(View view){
    Intent intent = new Intent(this, SecondPage.class);
    startActivity(intent);
}
}
