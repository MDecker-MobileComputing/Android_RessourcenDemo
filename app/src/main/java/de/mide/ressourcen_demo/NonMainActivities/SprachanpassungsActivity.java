package de.mide.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.os.Bundle;

import de.mide.ressourcen_demo.R;


/**
 * Activity demonstriert Anpassung von Texten und auch Grafiken
 * an verschiedene Sprachen.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class SprachanpassungsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprachanpassung);
    }

}
