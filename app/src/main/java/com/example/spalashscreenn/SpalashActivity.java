package com.example.spalashscreenn;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpalashActivity extends AppCompatActivity {

    @Override  //Annotation
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spalash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Handler h;  //object deleraction
        h=new Handler(); // object Intrialization
        //Handler h=new Handler()     Shortcut
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SpalashActivity.this, LoginActivity.class);   //Alt+Enter
                startActivity(i);
                finish();
            }
        },2000);


    }

}