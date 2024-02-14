package de.mide.android.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import de.mide.android.ressourcen_demo.R;


/**
 * Activity zur Demonstration des Zugriffs auf die Elemente der 
 * Array-Ressource <code>staedte_in_deutschland</code>
 * (siehe Ressourcen-Datei <code>res/values/meine_arrays.xml</code>).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class ArrayRessourcenActivity extends Activity {

    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_ressource);
    }


    /**
     * Button-Event-Handler-Methode, die in der Layout-Datei
     * über das Attribut <code>onClick</code> zugewiesen wird;
     * zeigt zufällig ausgewähltes String-Element (Stadt)
     * aus der Array-Ressource <code>staedte_in_deutschlan</code> 
     * an.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onZufallsStadtClick(View view) {

        String[] stringArray = null;

        Resources res = getResources();

        stringArray = res.getStringArray( R.array.staedte_in_deutschland );

        // Zufälliges Element aus Array auswählen
        int anzElement   = stringArray.length;
        Random random    = new Random();
        int zufallsIndex = random.nextInt( anzElement );
        String stadt     = stringArray[ zufallsIndex ];

        Toast.makeText(this, stadt, Toast.LENGTH_LONG).show();
    }

}
