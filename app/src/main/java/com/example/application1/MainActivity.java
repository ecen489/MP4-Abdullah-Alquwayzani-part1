package com.example.application1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button B1;
    public EditText ET1;
    public TextView TV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button) findViewById(R.id.button);
        ET1 = (EditText) findViewById(R.id.editText);
        TV1 = (TextView) findViewById(R.id.textView);
    }
    public void buttonClick1 (View view){
        TV1.setText(ET1.getText());
        ET1.setText("");
    }
}
