package com.example.firstgame;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Story extends AppCompatActivity {
    MainActivity gs;
    String nextPos1, nextPos2, nextPos3, nextPos4;
    int homework = 10;
    Random rng = new Random();

    public Story(MainActivity gs){
        this.gs = gs;
    }

    public void selectPosition(String choice){
        showAllButton();
        switch (choice){
            case "start": startingPoint(); break;
            case "sport": sport(); break;
            case "fortnite": fortnite(); break;
            case "roblox": roblox(); break;
            case "gta": gta(); break;
            case "parents": parents(); break;
            case "game": game(); break;
            case "argue": argue(); break;
            case "loadScreen": gs.titleScreen(); break;
            case "homework": homework(); break;
            case "zoom": zoom(); break;
        }
    }
    public void showAllButton(){
        gs.choice2.setVisibility(View.VISIBLE);
        gs.choice3.setVisibility(View.VISIBLE);
        gs.choice4.setVisibility(View.VISIBLE);
    }
    public void startingPoint(){
        gs.imageView.setImageResource(R.drawable.quarantine);

        gs.description.setText("You are in your room in the new world called quarantine. You cannot go outside.\nWhat do you want to do?");

        gs.choice1.setText("Use your computer and watch some sports");
        gs.choice2.setText("Use your computer and play some games");
        gs.choice3.setText("Use your computer and log into Zoom for classes");
        gs.choice4.setText("Do some homework");

        nextPos1 = "sport";
        nextPos2 = "game";
        nextPos3 = "zoom";
        nextPos4 = "homework";
    }

    public void sport(){
        gs.imageView.setImageResource(R.drawable.nosport);

        gs.description.setText("You turn on your laptop, log in, and search up for live sports games. But it's quarantine season, which means no sport games.\nMaybe you go back and do something else.");

        gs.choice1.setText("Back");
        gs.choice2.setVisibility(View.INVISIBLE);
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "start";
    }

    public void game(){
        gs.imageView.setImageResource(R.drawable.game);

        gs.description.setText("You turn on your laptop, log in, and now you need to choose a game to play. \nWhat will it be?");

        gs.choice1.setText("Fortnite");
        gs.choice2.setText("Roblox");
        gs.choice3.setText("GTA");
        gs.choice4.setText("Nevermind");

        nextPos1 = "fortnite";
        nextPos2 = "roblox";
        nextPos3 = "gta";
        nextPos4 = "start";
    }

    public void roblox(){
        gs.imageView.setImageResource(R.drawable.roblox);

        gs.description.setText("You play Roblox for a bit, but then you get bored of playing games.");

        gs.choice1.setText("Back");
        gs.choice2.setVisibility(View.INVISIBLE);
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "start";
    }

    public void fortnite(){
        gs.imageView.setImageResource(R.drawable.fortnite);

        gs.description.setText("You try to play Fortnite, but all the nine year olds annoy the shit out of you. \nYou shp");

        gs.choice1.setText("Back");
        gs.choice2.setVisibility(View.INVISIBLE);
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "game";
    }

    public void gta(){
        gs.imageView.setImageResource(R.drawable.gta);

        gs.description.setText("You play GTA for a bit, but then your parents are awoken by the loud noises. They come into your room...");

        gs.choice1.setText(">");
        gs.choice2.setVisibility(View.INVISIBLE);
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "parents";
    }

    public void parents(){
        gs.imageView.setImageResource(R.drawable.angryparent);

        gs.description.setText("Your parents find out that you are playing video games when you should do some homework. \nWhat do you want to do next?");

        gs.choice1.setText("Do homework");
        gs.choice2.setText("Argue with your parents");
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "homework";
        nextPos2 = "argue";
    }

    public void homework(){
        homework--;
        if (homework == 0){
            gs.imageView.setImageResource(R.drawable.liberty);

            gs.description.setText("You finished all your homework! You win and can do anything now with no pressure!");

            gs.choice1.setText("Restart the game");
            gs.choice3.setVisibility(View.INVISIBLE);
            gs.choice4.setVisibility(View.INVISIBLE);
            gs.choice2.setVisibility(View.INVISIBLE);

            nextPos1 = "loadScreen";
        }else {
            gs.imageView.setImageResource(R.drawable.homework);

            gs.description.setText("You do one homework and have " + homework + " more homework left. \nWhat do you want to do?");

            gs.choice1.setText("Continue doing homework");
            gs.choice2.setText("Do something else");
            gs.choice3.setVisibility(View.INVISIBLE);
            gs.choice4.setVisibility(View.INVISIBLE);

            nextPos1 = "homework";
            nextPos2 = "start";
        }
    }

    public void argue(){
        gs.imageView.setImageResource(R.drawable.disown);

        gs.description.setText("Your parents disown you.\nYou lost.");

        gs.choice1.setText(">");
        gs.choice2.setVisibility(View.INVISIBLE);
        gs.choice3.setVisibility(View.INVISIBLE);
        gs.choice4.setVisibility(View.INVISIBLE);

        nextPos1 = "loadScreen";
    }

    public void zoom(){
        if (rng.nextInt(2) == 1){
            gs.imageView.setImageResource(R.drawable.phew);

            gs.description.setText("Hmm. Seems like there isn't class right now! Time to do other things!");

            gs.choice1.setText("Do other things");
            gs.choice2.setVisibility(View.INVISIBLE);
            gs.choice3.setVisibility(View.INVISIBLE);
            gs.choice4.setVisibility(View.INVISIBLE);

            nextPos1 = "start";
        }else{
            gs.imageView.setImageResource(R.drawable.zoom);

            gs.description.setText("Ah shucks. You had class and now you have to suffer with more homework.");
            homework++;

            gs.choice1.setText("Do homework");
            gs.choice2.setText("Do other things");
            gs.choice3.setVisibility(View.INVISIBLE);
            gs.choice4.setVisibility(View.INVISIBLE);

            nextPos1 = "homework";
            nextPos2 = "start";
        }
    }
}
