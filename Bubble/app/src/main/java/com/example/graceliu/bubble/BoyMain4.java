//What is the colour? white black red blue 1,2,3,4
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

public class BoyMain4 extends AppCompatActivity {

    private ActionBar actionBar;

    private Button col1;
    private Button col2;
    private Button col3;
    private Button col4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_main4);

        col1 = (Button)findViewById(R.id.col1);
        col2 = (Button)findViewById(R.id.col2);
        col3 = (Button)findViewById(R.id.col3);
        col4 = (Button)findViewById(R.id.col4);

        //myProj myProj1 = new myProj();

        col1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setColour(1);
                botButton.setColour(1);
                shoeButton.setColour(1);
            }
        });
        col2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setColour(2);
                botButton.setColour(2);
                shoeButton.setColour(2);
            }
        });
        col3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setColour(3);
                botButton.setColour(3);
                shoeButton.setColour(3);
            }
        });
        col4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy4();
                topButton.setColour(4);
                botButton.setColour(4);
                shoeButton.setColour(4);
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
        Intent intent = new Intent(BoyMain4.this, ResultMain.class);
        startActivity(intent);
    }
}
