package com.example.javami;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class SelectGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_game);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.select_game, menu);
        return true;
    }

    public void start_handwriting_game (View view) {
        Intent intent = new Intent(this, HandwritingGame.class);
        startActivity(intent);
    }

    public void start_search_sort_game (View view) {
        Intent intent = new Intent(this, SearchSortGame.class);
        startActivity(intent);
    }

    public void start_memory_game (View view) {
        Intent intent = new Intent(this, MemoryGame.class);
        startActivity(intent);
    }

}
