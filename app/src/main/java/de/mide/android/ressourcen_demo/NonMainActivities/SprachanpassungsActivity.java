package de.mide.android.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.os.Bundle;

import de.mide.android.ressourcen_demo.R;


/**
 * Activity demonstriert Anpassung von Texten und Grafiken an verschiedene Sprachen
 * (Internationalization, i18n).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class SprachanpassungsActivity extends Activity {

    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprachanpassung);
    }

}
