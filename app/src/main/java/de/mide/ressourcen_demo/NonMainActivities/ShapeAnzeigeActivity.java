package de.mide.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.os.Bundle;

import de.mide.ressourcen_demo.R;


/**
 * Activity zeigt ein "Shape" an
 * (<a href="//developer.android.com/guide/topics/resources/drawable-resource#Shape">Shape Drawable</a>).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class ShapeAnzeigeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_anzeige);
    }

}
