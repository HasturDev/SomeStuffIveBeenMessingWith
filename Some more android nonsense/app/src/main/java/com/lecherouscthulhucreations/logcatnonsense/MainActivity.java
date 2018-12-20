package com.lecherouscthulhucreations.logcatnonsense;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    void printstuff(int myInt){
        Log.d("info", "myInt =" + myInt);
        Log.d("info", "This is the int only version");
    }
    void printStuff(String myString) {
        Log.i("info", "This is the String only version");
        Log.i("info", "myInt =" + myInt);
        Log.i("info", "myString =" + myString);
    }
    void pringStruff(int myInt, String myString) {
        Log.i("info", "This is the combined int and String versions");
        Log.i("info", "myInt =" + "myInt");
        Log.i("info", "myString =" + myString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Now Calling the different versions of printStuff
        // The name stays the saem, only the parameters vary
        printstuff(anInt);
        printStuff(aString);
        printstuff(andInt, aString);
    }
}
