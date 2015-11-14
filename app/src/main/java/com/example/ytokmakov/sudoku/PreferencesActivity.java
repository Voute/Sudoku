package com.example.ytokmakov.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by YTokmakov on 13.11.2015.
 */
public class PreferencesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
