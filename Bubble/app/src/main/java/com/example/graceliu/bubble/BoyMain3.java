//How comfortable is it? 1,2,3
package com.example.graceliu.bubble;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.graceliu.bubble.BoyMain.botButton;
import static com.example.graceliu.bubble.BoyMain.shoeButton;
import static com.example.graceliu.bubble.BoyMain.topButton;

public class BoyMain3 extends AppCompatActivity {

    private ActionBar actionBar;
    private Button comfo1;
    private Button comfo2;
    private Button comfo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_main3);

        comfo1 = (Button)findViewById(R.id.comfo1);
        comfo2 = (Button)findViewById(R.id.comfo2);
        comfo3 = (Button)findViewById(R.id.comfo3);

        //myProj myProj1 = new myProj();

        comfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setComfort(1);
                botButton.setComfort(1);
                shoeButton.setComfort(1);
            }
        });
        comfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setComfort(2);
                botButton.setComfort(2);
                shoeButton.setComfort(2);
            }
        });
        comfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setComfort(3);
                botButton.setComfort(3);
                shoeButton.setComfort(3);
            }
        });

        actionBar=getSupportActionBar();
        if(Main2Activity.boy == true) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3476c1")));
        } else {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D81B60")));
        }
    }
    public void openActivityBoy4(){
        Intent intent = new Intent(BoyMain3.this, BoyMain4.class);
        startActivity(intent);
    }
}
