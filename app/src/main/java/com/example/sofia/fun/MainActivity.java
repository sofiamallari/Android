package com.example.sofia.fun;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String tag="Activities";
    private FactBook mFactBook= new FactBook();
    private Colors mColors= new Colors();
    private TextView text;
    private Button btnshow;
    private RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.fun);
        btnshow=(Button)findViewById(R.id.button);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.rel);

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact=mFactBook.get();
                int color=mColors.getColor();
                text.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                btnshow.setTextColor(color);

            }
        };
        btnshow.setOnClickListener(listen);
        //Toast.makeText(MainActivity.this, "New info", Toast.LENGTH_SHORT).show();
        //Log.d(tag,"Log here");
    }

}
