package com.example.firstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView description;
    Button choice1, choice2, choice3, choice4;

    Story story = new Story( this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        description = (TextView)findViewById(R.id.description);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);

        choice1.setTransformationMethod(null);
        choice2.setTransformationMethod(null);
        choice3.setTransformationMethod(null);
        choice4.setTransformationMethod(null);

        story.startingPoint();
    }
    public void button1(View view){
        story.selectPosition(story.nextPos1);
    }
    public void button2(View view){
        story.selectPosition(story.nextPos2);
    }
    public void button3(View view){
        story.selectPosition(story.nextPos3);
    }
    public void button4(View view){
        story.selectPosition(story.nextPos4);
    }

    public void titleScreen(){
        Intent titleScreen = new Intent(this,TitleScreen.class);
        startActivity(titleScreen);
    }
}