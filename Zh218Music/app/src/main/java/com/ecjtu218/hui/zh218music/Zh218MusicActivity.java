package com.ecjtu218.hui.zh218music;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Zh218MusicActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return Zh218MusicFragment.newInstance();
    }
}