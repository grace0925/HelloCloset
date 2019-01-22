//Is it summer? T/F
package com.example.graceliu.bubble;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoyMain extends AppCompatActivity {
    private ActionBar actionBar;
    private Button weatherYes;
    private Button weatherNo;

    public static Top topButton = new Top();
    public static Bottom botButton = new Bottom();
    public static Shoes shoeButton = new Shoes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_main);

        weatherYes = (Button)findViewById(R.id.weatherYes);
        weatherNo = (Button)findViewById(R.id.weatherNo);

        weatherYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy2();
                topButton.setSeason(true);
                botButton.setSeason(true);
                shoeButton.setSeason(true);
            }
        });
        weatherNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBoy2();
                topButton.setSeason(false);
                botButton.setSeason(false);
                shoeButton.setSeason(false);
            }
        });

        actionBar=getSupportActionBar();
        if(Main2Activity.boy == true) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3476c1")));
        } else {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D81B60")));
        }

    }

        public void openActivityBoy2(){
            Intent intent = new Intent(BoyMain.this, BoyMain2.class);
            startActivity(intent);
        }
}
