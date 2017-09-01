package com.appexample.hourzero;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Intent myIntent = new Intent(MainActivity.this, About.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Home) {
            // Handle the camera action
        } else if (id == R.id.Top) {
            Intent myIntent = new Intent(MainActivity.this, Top.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Gaming) {
            Intent myIntent = new Intent(MainActivity.this, Gaming.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Education) {
            Intent myIntent = new Intent(MainActivity.this, Education.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Entertainment) {
            Intent myIntent = new Intent(MainActivity.this, Entertainment.class);
           MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Music) {
             Intent myIntent = new Intent(MainActivity.this, Music.class);
             MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.world) {
            Intent myIntent = new Intent(MainActivity.this, World.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Tech) {
            Intent myIntent = new Intent(MainActivity.this, Tech.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Sports) {
            Intent myIntent = new Intent(MainActivity.this, Sports.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.Finance) {
            Intent myIntent = new Intent(MainActivity.this, Finance.class);
            MainActivity.this.startActivity(myIntent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
