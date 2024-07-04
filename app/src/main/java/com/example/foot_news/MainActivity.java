package com.example.foot_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Email, Password;
    Button btn;
    TextView textView ,register,forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textV);
        register = findViewById(R.id.register);
        forgot =findViewById(R.id.forgot);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                if (email.isEmpty() || password.isEmpty()) {
                    textView.setText("Please fill all fields");
                } else {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);
                startActivity(intent);
            }
        });
    }
}
