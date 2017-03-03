package com.example.vicapps.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyLogin extends AppCompatActivity {
    EditText etUserName,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login_);
        TextView myTitle = (TextView) findViewById(R.id.tvTitleLogin);
        TextView mySubtitle = (TextView)findViewById(R.id.tvSubtitleLogin);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
        etPassword = (EditText) findViewById(R.id.tv_contraseña);
        etUserName = (EditText) findViewById(R.id.tv_name);
    }
    public void enter(View v){
        Intent i = new Intent(this,MyMain.class);
        startActivity(i);



    }
    public void toSign(View v){
        Toast.makeText(this,"Don't worry , you can pass",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,MyMain.class);
        startActivity(i);

    }
}
