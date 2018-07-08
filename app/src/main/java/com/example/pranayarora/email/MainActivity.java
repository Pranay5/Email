package com.example.pranayarora.email;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1,e2,e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == b1.getId()) {
            String a, b, c;
            a = e1.getText().toString();
            b = e2.getText().toString();
            c = e3.getText().toString();
            Intent A = new Intent(Intent.ACTION_SEND);
            A.putExtra(Intent.EXTRA_EMAIL,a);
            A.putExtra(Intent.EXTRA_SUBJECT,b);
            A.putExtra(Intent.EXTRA_TEXT,c);
            A.setType("Message/rfc882");
            startActivity(Intent.createChooser(A,"choose an Email client" ));
        }

    }
}
