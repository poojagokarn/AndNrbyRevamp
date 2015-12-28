package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class Bookmarks extends ActionBarActivity {

    android.support.v7.app.ActionBar actionBar;
    private RecyclerView bookmarksRecyclerView;
    private RecyclerView.Adapter bookmarksAdapter;
    private RecyclerView.LayoutManager bookmarksLayoutManager;
    RelativeLayout showMenu;
    int floatingActionButtonCounter=0;
    String messageToShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);

        customActionBar();
        findViews();
    }

    private void customActionBar(){

        actionBar = getSupportActionBar();
        actionBar.setTitle(" My Likes");
        actionBar.setLogo(R.drawable.logo);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);

    }

    private void findViews(){

        bookmarksRecyclerView = (RecyclerView) findViewById(R.id.bookmarks_recycler_view);
        showMenu = (RelativeLayout) findViewById(R.id.showMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bookmarks, menu);
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
