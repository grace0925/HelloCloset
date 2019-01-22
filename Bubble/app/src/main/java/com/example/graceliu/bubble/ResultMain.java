//result and try again
package com.example.graceliu.bubble;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultMain extends AppCompatActivity {

    private ActionBar actionBar;

    private Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_main);

        again  =(Button) findViewById(R.id.again);

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryAgain();
            }
        });

        actionBar=getSupportActionBar();
        if(Main2Activity.boy == true) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3476c1")));
        } else {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D81B60")));
        }
    }
    public void tryAgain() {
        Intent intent = new Intent(ResultMain.this, Main2Activity.class);
        startActivity(intent);
    }
}
