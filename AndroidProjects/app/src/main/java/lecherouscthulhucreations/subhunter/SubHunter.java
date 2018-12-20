package lecherouscthulhucreations.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.Random;
import android.view.Display;
import android.util.Log;
import android.widget.ImageView;

public class SubHunter extends Activity {

    // These variables can be "seen"
    // throughout the SubHunter class
    int numberHorizontalPixels;
    int numberVerticalPixels;
    int blockSize;
    int gridWidth = 40;
    int gridHeight;
    float horizontalTouched = -100;
    float verticalTouched = -100;
    int subHorizontalPosition;
    int subVerticalPosition;
    int shotsTaken;
    int distanceFromSub;
    boolean debugging = true;
    boolean hit = false;

    /*
 Android runs this code just before
 the player sees the app.
 This makes it a good place to add
 the code for the one-time setup phase.
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Get the current device's screen resolution
        Display display = getWindowManager(). getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        // Initialize our size based variables
        // based on the screen resolution
        numberHorizontalPixels = size.x;
        numberVerticalPixels = size.y;
        blockSize = numberHorizontalPixels / gridWidth;
        gridHeight = numberVerticalPixels / blockSize;


    Log.d("Debugging", "In onCreate");
    newGame();
    draw();
    }

    private void draw() {
    }

    /*
 This code will execute when a new
 game needs to be started. It will
 happen when the app is first started
 and after the player wins a game.
 */

 /*
 Here we will do all the drawing.
 The grid lines, the HUD and
 the touch indicator
 */
 public void newGame(){
     Log.d("Debugging", "In draw");
     printDebuggingText();

 }
 /*
 This part of the code will
 handle detecting that the player
 has tapped the screen
 */
 @Override
 public boolean onTouchEvent (MotionEvent motionEvent){
     Log.d("Debugging", "In onTouchEvent");
     takeShot();
     return true;
 }
 /*
 The code here will execute when
 the player taps the screen. It will
 calculate the distance from the sub'
 and decide a hit or miss
 */

 public void takeShot(){
     Log.d("Debugging", "In takeShot");
     draw();

 }
    // This code says "BOOM!"
    public void boom(){

    }
    // This code prints the debugging text
    public void printDebuggingText(){
     Log.d("numberHorizontalPixels", "" + numberHorizontalPixels);
     Log.d("numberVerticalPixels", "" + numberVerticalPixels);

     Log.d("blockSize", "" + blockSize);
     Log.d("gridWidth", "" + gridWidth);
     Log.d("gridHeight", "" + gridHeight);
     Log.d("horizontalTouched", "" + horizontalTouched);
     Log.d("verticalTouched", "" + verticalTouched);
     Log.d("subHorizontalPosition", "" + subHorizontalPosition);
     Log.d("subVerticalPosition", "" + subVerticalPosition);
     Log.d("hit", "" + hit);
     Log.d("shotsTaken", "" + shotsTaken);
     Log.d("debugging", "" + debugging);
     Log.d("distanceFromSub", "" + distanceFromSub);


    }
}
