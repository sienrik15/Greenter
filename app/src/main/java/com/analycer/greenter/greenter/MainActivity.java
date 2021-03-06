package com.analycer.greenter.greenter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.analycer.greenter.greenter.fragments.CategoriaFragment;
import com.analycer.greenter.greenter.fragments.ClientFragment;
import com.analycer.greenter.greenter.fragments.ClientFutureFragment;
import com.analycer.greenter.greenter.fragments.ComprobantesFragment;
import com.analycer.greenter.greenter.fragments.ProductsFragment;
import com.analycer.greenter.greenter.fragments.ResumFragment;
import com.greenter.core.callback.ApiDataRequest;
import com.greenter.core.model.DataStore;
import com.greenter.core.service.ApiService;
import com.greenter.core.service.DataService;
import com.greenter.core.service.DataStoreService;
import com.greenter.core.service.NetWorking;
import com.analycer.greenter.greenter.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ApiDataRequest<DataStore> {

    private static final String API_ENDPOINT = "https://factesol.ml/sunat/public/api/v1";
    private static final String API_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjEiLCJuYmYiOjE1MTE0NTE4OTV9.0uGFLIbChXekLErY1fNpDfZaywwO-TuQuBeLn4cx63I";
    //private FloatingActionButton fab;
    private Toolbar toolbar;
    private Fragment mResumFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mIntent = new Intent(this, IntroSplashActivity.class);
        startActivity(mIntent);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById();
        addEvents();

        NetWorking.init(getApplicationContext(), API_ENDPOINT);
        ApiService.setToken(API_TOKEN);
        new DataStoreService(this).getAll();

    }

    private void findViewById(){
        //fab = (FloatingActionButton) findViewById(R.id.fab);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mResumFragment = new ResumFragment();
        FragmentManager mFragmentManager = getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.mainFrgamnet,mResumFragment).commit();

    }

    private void addEvents(){
      /*  fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment mFragment = null;
        final FragmentManager mFragmentManager = getSupportFragmentManager();

        switch (id){
            case R.id.nav_resumen:
                mFragment = mResumFragment;
                break;
            case R.id.nav_product:
                mFragment = new ProductsFragment();
                break;
            case R.id.nav_category:
                mFragment = new CategoriaFragment();
                break;
            case R.id.nav_client:
                mFragment =new ClientFragment();
                break;
            case R.id.nav_compro:
                mFragment = new ComprobantesFragment();
                break;
            case R.id.nav_share:
                mFragment = new ClientFutureFragment();
                break;
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        if (mFragment!=null){
            final Fragment finalMFragment = mFragment;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mFragmentManager.beginTransaction().replace(R.id.mainFrgamnet, finalMFragment).commit();
                }
            }, 400);
        }
        return true;
    }

    @Override
    public void setApiResponse(DataStore data) {
        DataService.getInstance().setDataStore(data);
        // callback - finish load data
    }
}
