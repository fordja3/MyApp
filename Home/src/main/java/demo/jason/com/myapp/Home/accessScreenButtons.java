package demo.jason.com.myapp.Home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static demo.jason.com.myapp.Home.R.id.textView;


public class accessScreenButtons extends AppCompatActivity {

    int buttonClickCounter;

    String buttonClick1;
    String buttonClick2;
    String buttonClick3;
    String buttonClick4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_screen_buttons);

        // Locate the button in activity_main.xml
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);

        final Button buttonSubmit = findViewById(R.id.submitButton);

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                buttonClickCounter++;
            }
        });

        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                buttonClickCounter++;
                buttonClickCounter++;
                final String buttonClick2 = accessScreenButtons.this.buttonClick2;

            }
        });

        // Capture button clicks
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                buttonClickCounter++;
                buttonClickCounter++;
                buttonClickCounter++;
                final String buttonClick3 = accessScreenButtons.this.buttonClick3;


            }
        });

        // Capture button4 clicks
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                buttonClickCounter++;
                buttonClickCounter++;
                buttonClickCounter++;
                buttonClickCounter++;
                final String buttonClick4 = accessScreenButtons.this.buttonClick4;

            }
        });

        // Capture buttonSubmit clicks
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
// returns "the app is unlocked" if the password is correct and "wrong password" if incorrect
            @SuppressLint("SetTextI18n")
            public void onClick(View arg0) {
                if(buttonClickCounter == 10) {

                    Toast.makeText(getApplicationContext(), "The app is UNLOCKED!!!", Toast.LENGTH_SHORT)
                            .show();

                    Intent move = new Intent(accessScreenButtons.this, MainActivity.class);
                    startActivity(move);


                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT)
                            .show();
                    Intent move = new Intent(accessScreenButtons.this, MainActivity.class);
                    startActivity(move);
                }

            }
        });


    }
}


