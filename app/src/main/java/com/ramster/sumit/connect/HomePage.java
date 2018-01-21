package com.ramster.sumit.connect;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
  TextView blackTextView,regularTextView,lightTextView,thinTextView;
  Button button;Typeface robotoBlack,robotoLight,robotoRegular,robotoThin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

            blackTextView = (TextView)findViewById(R.id.blacktextView);
            regularTextView = (TextView)findViewById(R.id.regulartextView);
            lightTextView = (TextView)findViewById(R.id.lighttextView);
            thinTextView = (TextView)findViewById(R.id.thintextView);
            button=(Button)findViewById(R.id.button);

            robotoBlack=Typeface.createFromAsset(getAssets(),"font/Roboto-Black.ttf");
            robotoLight=Typeface.createFromAsset(getAssets(),"font/Roboto-Light.ttf");
            robotoRegular=Typeface.createFromAsset(getAssets(),"font/Roboto-Regular.ttf");
            robotoThin=Typeface.createFromAsset(getAssets(),"font/Roboto-Thin.ttf");


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    blackTextView.setTypeface(robotoBlack);
                    regularTextView.setTypeface(robotoRegular);
                    lightTextView.setTypeface(robotoLight);
                    thinTextView.setTypeface(robotoThin);
                }
            });
    }
}
