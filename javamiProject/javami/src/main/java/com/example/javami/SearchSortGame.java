package com.example.javami;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchSortGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_search_sort);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_sort_game, menu);
        return true;
    }
    
}
