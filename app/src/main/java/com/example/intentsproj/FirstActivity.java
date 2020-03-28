package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String NUMBER_1 = "com.example.intentproj.NUMBER_1";
    public static final String NUMBER_2 = "com.example.intentproj.NUMBER_2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //intent
        //get the intent that started this activity and extract the String
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.SENDING_MSG);

        //capture the layout's TextView and set the String as its value
        TextView textView = findViewById(R.id.textView6);
        textView.setText(message);

        //toast
        //The context to use. Usually, your application or activity object
        Context context = getApplicationContext();
        //display String
        CharSequence messageT = "You just clicked the OK button";

        //how long the toast message will last
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, messageT, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

    }

    //calls when the user taps the send button
    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        EditText editText1 = (EditText)findViewById(R.id.editText2);
        String message1 = editText.getText().toString();
        String message2 = editText1.getText().toString();
        intent.putExtra(NUMBER_1, message1);
        intent.putExtra(NUMBER_2, message2);
        startActivity(intent);
    }

}
