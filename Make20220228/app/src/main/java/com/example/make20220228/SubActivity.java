package com.example.make20220228;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main); //안녕하세요
        setContentView(R.layout.activity_sub); //안녕하세요
    }

    public void Btn1Click(View v){
        //Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        Toast toast = Toast.makeText(this, "test", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10,10);
        toast.show();
        //31:34
    }
}
