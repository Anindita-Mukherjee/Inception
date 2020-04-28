package com.example.inception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberPicker=(NumberPicker)findViewById(R.id.numberPicker);
        String[] possibilitiesString={"color_Transition","learn_Chess","send_Sms","play Music"};
        numberPicker.setDisplayedValues(possibilitiesString);
        numberPicker.setMaxValue(possibilitiesString.length-1);
        numberPicker.setMinValue(0);
    }
    public void go(View v)
    {
        int choice=numberPicker.getValue();
        switch (choice)
        {
            case 0:
                Intent goToSecond=new Intent(this,SecondActivity.class);
                startActivity(goToSecond);
                break;
            case 1:
                Intent goToThird=new Intent(this,ThirdActivity.class);
                startActivity(goToThird);
                break;
            case 2:
                Intent goToFourth=new Intent(this,FourthActivity.class);
                startActivity(goToFourth);
                break;
            case 3:
                Intent goToFifth=new Intent(this,FifthActivity.class);
                startActivity(goToFifth);
                break;
        }
    }
}
