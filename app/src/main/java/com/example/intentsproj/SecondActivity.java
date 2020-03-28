package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private  Button sub;
    private Button mul;
    private Button div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get the intent that started this activity and extract the String
        Intent intent = getIntent();
        String message_num1 = intent.getStringExtra(FirstActivity.NUMBER_1);
        String message_num2 = intent.getStringExtra(FirstActivity.NUMBER_2);

        //capture the layout's TextView and set the String as its value
        TextView textView = findViewById(R.id.editText3);
        TextView textView1 = findViewById(R.id.button4);
        textView.setText(message_num1);
        textView1.setText(message_num2);

        //calculations
        num1 = (EditText)findViewById(R.id.editText3);
        num2 = (EditText)findViewById(R.id.editText4);
        add = (Button)findViewById(R.id.button2);
        sub =  (Button)findViewById(R.id.button3);
        mul = (Button)findViewById(R.id.button4);
        div = (Button)findViewById(R.id.button5);
        result = (TextView)findViewById(R.id.textView5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer : " + String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 - number2;
                result.setText("Answer : " + String.valueOf(sum));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 * number2;
                result.setText("Answer : " + String.valueOf(sum));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 / number2;
                result.setText("Answer : " + String.valueOf(sum));
            }
        });
    }
}
