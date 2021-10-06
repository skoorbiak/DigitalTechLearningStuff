package com.example.digitaltechlearningstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.textViewPassword);
        String content = editPassword.getText().toString();

        if (content.equals("Password")) {
            startActivity(new Intent(MainActivity.this, wee_wee_woo_woo.class));
        } else {
            toastMsg("Wrong Password Bruvva! go away you like suck at this stuff");

        }
    }
}