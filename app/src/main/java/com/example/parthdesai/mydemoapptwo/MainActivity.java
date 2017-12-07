package com.example.parthdesai.mydemoapptwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ScrollView mScrollView;
    TextView mTextView;
    Button mButtonClear,mButtonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);
        mScrollView = (ScrollView)findViewById(R.id.scrollView2);
        mTextView.setText("");
        mButtonClear = (Button)findViewById(R.id.button2);
        mButtonClear = (Button)findViewById(R.id.button);
    }

}
