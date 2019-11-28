package com.tdg.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import android.widget.ImageView;
import java.util.Random;

public class SubHunter extends Activity {

    /**
     *
     * Variables to be used throughout the SubHunter class
     */
    private int numXPixels;
    private int numYPixels;
    private int blockSize;
    private int gridWidth = 40;
    private int gridHeight;
    private float xPixelTouched = -100;
    private float yPixelTouched = -100;
    private int subXPos;
    private int subYPos;
    private boolean hit = false;
    private int shotsTaken;
    private int distanceFromSub;
    private boolean debugging = true;




    /**
     *  Android runs this code just before
     *  the player sees the app.
     *  This makes it a good place to add
     *  the code for the one-time setup phase.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the current device's screen resolution 
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        // Initialize size based variables
        numXPixels = size.x;
        numYPixels = size.y;
        blockSize = numXPixels / gridWidth;
        gridHeight = numYPixels / blockSize;

        // Start the game
        Log.d("Debugging", "In onCreate");
        newGame();
        draw();
    }

    /**
     *   This code will execute when a new
     *   game needs to be started. It will
     *   happen when the app is first started
     *   and after the player wins a game.
     */
    private void newGame() {
        Log.d("Debugging", "In newGame");
    }

    /**
     *   Here we will do all the drawing.
     *   The grid lines, the HUD and
     *   the touch indicator
     */
    private void draw() {
        Log.d("Debugging", "In draw");
        printDebuggingText();
    }

    /**
     *   This part of the code will
     *   handle detecting that the player
     *   has tapped the screen
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("Debugging", "In onTouchEvent");
        takeShot();
        return true;
    }

    /**
     *   The code here will execute when
     *   the player taps the screen. It will
     *   calculate the distance from the sub'
     *   and decide a hit or miss
     */
    private void takeShot() {
        Log.d("Debugging", "In takeShot");
        draw();
    }


    /**
     * This code says "BOOM!"
     */
    private void boom() {

    }

    /**
     * This code prints the debugging text
     */
    private void printDebuggingText() {
        Log.d("numXPixels: "," " + numXPixels);
        Log.d("numYPixels: "," " + numYPixels);
        Log.d("blockSize: "," " + blockSize);
        Log.d("gridWidth: "," " + gridWidth);
        Log.d("gridHeight" ," " + gridHeight);
        Log.d("xPixelTouched: "," " + xPixelTouched);
        Log.d("yPixelTouched: "," " + yPixelTouched);
        Log.d("subXPos: "," " + subXPos);
        Log.d("subYPos: "," " + subYPos);
        Log.d("hit: "," " + hit);
        Log.d("shotsTaken: "," " + shotsTaken);
        Log.d("debugging: "," " + debugging);
        Log.d("distanceFromSub: "," " + distanceFromSub);
    }
}
