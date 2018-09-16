package demo.jason.com.myapp.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        Button button = findViewById(R.id.unlockButton);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move = new Intent(MainActivity.this, accessScreenButtons.class);
                startActivity(move);
            }
        });



    }
}








   /* [CMSC 355] Assignment 1 : Starting with Android and GitDr. Kosta Damevski
        DUE: Midnight, September 16th, 2018
        (firm deadline)Our second assignment is basically a warm-up for the project.
        The goal is to create a simple Android app,and place it in a clean and well-organized Git repository.

       1. First, I’ll describe their requirements for the Androidapp, and then for the Git repo.
        Both steps are graded.
        1  Android App: Simple Security AppThe app you are to write consists of two screens:

            1) aWelcomescreen and

            2) an AccessControlscreen.

            •When starting the app,
            the user is presented with theWelcomescreen, containing a TextView widget that displays the message
            ”Welcome to the App! The Appis LOCKED!”

            and a Button labeled”Unlock”.
            When the ”Unlock” button is clicked,
            theAccessControlscreen is displayed.•

            TheAccessControlscreen has 4 Buttons for the digits 1-4,

            and a ”Submit” Button.  The digit buttons are to enter the access code,
            while the ”Submit” Button checks the code and returns to the Welcomescreen regardless of
            whether the code is correct.

            If the code is correct, the TextView in the Welcome screen should display the ”The App is Unlocked.” message.

            However, if the code is incorrect,the TextView should display the locked message.

        •For simplicity, you can hardcode the security code of ”1234”as the correct combination.

    */
