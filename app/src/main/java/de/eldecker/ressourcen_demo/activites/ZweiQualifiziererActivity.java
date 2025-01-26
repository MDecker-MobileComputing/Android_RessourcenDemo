package de.eldecker.ressourcen_demo.activites;

import android.app.Activity;
import android.os.Bundle;

import de.eldecker.ressourcen_demo.R;


/**
 * Von der Activity geladene Layout-Datei enthält eine Grafik
 * in einem {@code ImageView}-Element, die sowohl von der aktuellen
 * Systemsprache als auch der Ausrichtung des Displays (hochkant
 * oder quer) abhängt.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class ZweiQualifiziererActivity extends Activity {

    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zwei_qualifizierer);
    }

}
