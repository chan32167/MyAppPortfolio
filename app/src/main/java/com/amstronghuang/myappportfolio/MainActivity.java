package com.amstronghuang.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_spotify_streamer), Toast.LENGTH_SHORT).show();
            }
        });

        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_build_it_bigger), Toast.LENGTH_SHORT).show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_capstone), Toast.LENGTH_SHORT).show();
            }
        });

        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_library_app), Toast.LENGTH_SHORT).show();
            }
        });

        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_scores_app), Toast.LENGTH_SHORT).show();
            }
        });

        Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.title_xyz_reader),Toast.LENGTH_SHORT).show();
            }
        });
    }


    private String getToastText(int stringResourceId){
        return "This button will launch my " + getResources().getString(stringResourceId);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
