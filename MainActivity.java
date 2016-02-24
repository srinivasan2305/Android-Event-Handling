package com.example.srini.ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText uname =(EditText)findViewById(R.id.editText);
        final EditText pwd =(EditText)findViewById(R.id.editText2);
        final Button submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=uname.getText().toString();
                String pass=pwd.getText().toString();
                if(name.equals("srini") && pass.equals("srini")){
                    Intent i = new Intent(MainActivity.this,Home.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Login!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
