package com.example.java_4_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.java_4_4_3.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button button=findViewById(R.id.main_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User(20,"Shaxzod");
                nextPage(user);

            }
        });
    }
    void nextPage(User user){
        Intent intent=new Intent(this, MainActivity2.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}