package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.effect.Effect;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String SENDING_MSG = "com.example.intentproj.sending_msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when user taps the find button
    public void sendMessage(View view){
        Intent intent = new Intent(this, FirstActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText5);
        String message = editText.getText().toString();
        intent.putExtra(SENDING_MSG, message);
        startActivity(intent);
    }
}
