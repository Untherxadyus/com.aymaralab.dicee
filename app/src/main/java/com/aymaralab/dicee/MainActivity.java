package com.aymaralab.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    final int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6 };

    // Elements
    Button btnRoll;
    ImageView ivLeftDice;
    ImageView ivRightDIce;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieve elements
        btnRoll = findViewById(R.id.btnRoll);
        ivLeftDice = findViewById(R.id.ivLeftDice);
        ivRightDIce = findViewById(R.id.ivRightDice);

        // Reset Images
        ivLeftDice.setImageResource(diceArray[0]);
        ivRightDIce.setImageResource(diceArray[0]);


        btnRoll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Generate Random Numbers
                Random randomGenerator = new Random();

                int leftNumber = randomGenerator.nextInt(6);
                int rightNumber = randomGenerator.nextInt(6);

                // Update Images
                ivLeftDice.setImageResource(diceArray[leftNumber]);
                ivRightDIce.setImageResource(diceArray[rightNumber]);
            }
        });
    }


}
