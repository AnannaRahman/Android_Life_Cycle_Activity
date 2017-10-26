package com.example.ananna.lifecycleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"on Create",Toast.LENGTH_LONG).show();
       btnJump =(Button)findViewById(R.id.btnJump);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"on Start",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"on Resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"on Pause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"on Stop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"on Destroy",Toast.LENGTH_LONG).show();
    }


    public void jump(){
        Intent intent = new Intent(MainActivity.this,JumpActivity.class);
        startActivity(intent);
    }
}
