package com.example.inception;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final ImageView large=(ImageView)findViewById(R.id.large);
        large.setImageResource(R.drawable.drawing);
        final ImageView small=(ImageView)findViewById(R.id.small);
        small.setImageResource(R.drawable.drawing);
        SeekBar turner=(SeekBar)findViewById(R.id.seekBar_tuner);
        turner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastProgress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastProgress=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                large.setColorFilter(Color.argb(255,0,lastProgress,255-lastProgress));
            }
        });
    }
}
