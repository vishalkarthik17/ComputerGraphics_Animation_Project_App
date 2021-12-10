package com.example.cgv_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button like,health,Fine,in,sad,feelings,baby,wash;
    Button clean,cup,eat,good,happy,nice,parents,work;
    //16 Buttions
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like=findViewById(R.id.like);
        health=findViewById(R.id.health);
        Fine=findViewById(R.id.Fine);
        in=findViewById(R.id.in);
        sad=findViewById(R.id.sad);
        feelings=findViewById(R.id.feelings);
        baby=findViewById(R.id.baby);
        wash=findViewById(R.id.wash);

        clean=findViewById(R.id.clean);
        cup=findViewById(R.id.cup);
        eat=findViewById(R.id.eat);
        good=findViewById(R.id.good);
        happy=findViewById(R.id.happy);
        nice=findViewById(R.id.nice);
        parents=findViewById(R.id.parents);
        work=findViewById(R.id.work);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="clean";
                i.putExtra("vid",pass);
                startActivity(i);

            }
        });

        cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="cup";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="eat";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="good";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="happy";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        nice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="nice";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="parents";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="work";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });


        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="baby";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });


        feelings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="feelings";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="sad";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="in";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        Fine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="Fine";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="health";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="like";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });
        wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Video_Activity.class);
                String pass="wash";
                i.putExtra("vid",pass);
                startActivity(i);
            }
        });



    }
}