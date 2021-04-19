package android.example.com.splashscreenanotherway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     * First create an empty Activity for splash screen.
     * decorate xml screen, if use images than use vector images and custom font
     * Hide ActionBar (if use NoActionBar in themes than no need) and NotificationBar
     * Create an handler and set delayTime,Intent than finish the activity
     * Set luncher activity to SplashActivity instead of MainActivity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}