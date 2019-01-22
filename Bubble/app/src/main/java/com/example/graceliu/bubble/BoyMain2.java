//Is it formal? T/F
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

public class BoyMain2 extends AppCompatActivity {

    private ActionBar actionBar;
    private Button formalYes;
    private Button formalNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_main2);

        formalYes = (Button)findViewById(R.id.formalYes);
        formalNo = (Button)findViewById(R.id.formalNo);

        formalYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy3();
                topButton.setFormal(true);
                botButton.setFormal(true);
                shoeButton.setFormal(true);
            }
        });
        formalNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy3();
                topButton.setFormal(false);
                botButton.setFormal(false);
                shoeButton.setFormal(false);
            }
        });

        actionBar=getSupportActionBar();
        if(Main2Activity.boy == true) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3476c1")));
        } else {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D81B60")));
        }
    }
    public void openActivityBoy3(){
        Intent intent = new Intent(BoyMain2.this, BoyMain3.class);
        startActivity(intent);
    }
}
