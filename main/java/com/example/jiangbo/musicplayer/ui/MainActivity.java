package com.example.jiangbo.musicplayer.ui;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.jiangbo.musicplayer.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import butterknife.BindView;



public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sliding_layout)
    SlidingUpPanelLayout panelLayout;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 监听menu点击
     * @param navigationView
     */
    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(final MenuItem menuItem) {
                        updatePosition(menuItem);
                        return true;

                    }
                });
    }


    /**
     * 导航
     * @param menuItem
     */
    private void updatePosition(final MenuItem menuItem) {
//        runnable = null;
//
//        switch (menuItem.getItemId()) {
//            case R.id.nav_library:
//                runnable = navigateLibrary;
//                break;
//            case R.id.nav_playlists:
//                runnable = navigatePlaylist;
//                break;
//            case R.id.nav_folders:
//                runnable = navigateFolders;
//                break;
//            case R.id.nav_favourate:
//                runnable = navigateFavourate;
//                break;
//            case R.id.nav_recent_play:
//                runnable = navigateRecentPlay;
//                break;
//            case R.id.nav_recent_add:
//                runnable = navigateRecentAdd;
//                break;
//            case R.id.nav_play_ranking:
//                runnable = navigatePlayRanking;
//                break;
//            case R.id.nav_settings:
//                runnable = navigateSetting;
//                break;
//            case R.id.nav_exit:
//                this.finish();
//                break;
//        }
//
//        if (runnable != null) {
//            mDrawerLayout.closeDrawers();
//            Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    runnable.run();
//                }
//            }, 350);
//        }
    }
}
