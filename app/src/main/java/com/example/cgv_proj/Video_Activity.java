package com.example.cgv_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Activity extends AppCompatActivity {

    String path_ours="";
    String path_youtube="";

    VideoView ours,youtube;

    Button bck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        ours=findViewById(R.id.videoView);
        youtube=findViewById(R.id.videoView1);
        bck=findViewById(R.id.bck);

        MediaController mediaController=new MediaController(this);
        MediaController mediaController1=new MediaController(this);

        Bundle b=getIntent().getExtras();
        if(b.getString("vid")!=null){

            if(b.getString("vid").equals("clean")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.clean;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.cleanyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("cup")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.cup;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.cupyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("eat")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.eat;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.eatyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("good")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.good;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.goodyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("happy")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.happy;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.happyyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("nice")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.nice;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.niceyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("parents")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.parents;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.parentsyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("work")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.work;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.workyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }


            if(b.getString("vid").equals("baby")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.baby;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.babyyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("Fine")){

                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.fine;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.fineyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("sad")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.sad;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.sadyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);
            }
            if(b.getString("vid").equals("feelings")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.feelings;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.feelingsyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);
            }
            if(b.getString("vid").equals("in")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.in;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.inyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);
            }
            if(b.getString("vid").equals("health")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.health;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.healthyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);
            }
            if(b.getString("vid").equals("like")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.like;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.likeyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
            if(b.getString("vid").equals("wash")){
                path_ours="android.resource://"+getPackageName()+"/"+  R.raw.wash;
                Uri uri= Uri.parse(path_ours);
                ours.setVideoURI(uri);
                ours.setMediaController(mediaController);
                mediaController.setAnchorView(ours);

                path_youtube="android.resource://"+getPackageName()+"/"+  R.raw.washyoutube;
                Uri uri1= Uri.parse(path_youtube);
                youtube.setVideoURI(uri1);
                youtube.setMediaController(mediaController1);
                mediaController1.setAnchorView(youtube);

            }
        }

        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Video_Activity.this,MainActivity.class));
            }
        });



    }
}