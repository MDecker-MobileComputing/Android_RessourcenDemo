package de.mide.ressourcen_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.mide.ressourcen_demo.NonMainActivities.ArrayRessourcenActivity;
import de.mide.ressourcen_demo.NonMainActivities.FrameAnimationsActivity;
import de.mide.ressourcen_demo.NonMainActivities.TweenAnimationsActivity;
import de.mide.ressourcen_demo.NonMainActivities.ShapeAnzeigeActivity;
import de.mide.ressourcen_demo.NonMainActivities.SprachanpassungsActivity;
import de.mide.ressourcen_demo.NonMainActivities.ZweiQualifiziererActivity;


/**
 * App demonstriert Verwendung von verschiedenen Ressourcen.
 * <br><br>
 *
 * Die Klasse enthält für jeden Button auf der Layout-Datei eine
 * Event-Handler-Methode, die in der Layout-Datei mit dem Attribut
 * <code>onClick</code> zugewiesen wird.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity {

    /**
     * Lifecycle-Methode: Lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link SprachanpassungsActivity}.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonSprachanpassung(View view) {

        Intent intent = new Intent(this, SprachanpassungsActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link ShapeAnzeigeActivity}.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonShapeAnzeigen(View view) {

        Intent intent = new Intent(this, ShapeAnzeigeActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link TweenAnimationsActivity}.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonTweenAnimation(View view) {

        Intent intent = new Intent(this, TweenAnimationsActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link FrameAnimationsActivity}
     * (mit "Daumenkino"-Animation).
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonFrameAnimation(View view) {

        Intent intent = new Intent(this, FrameAnimationsActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link ArrayRessourcenActivity}
     * zu Anzeige einer aus einer Array-Ressource zufällig gewählten
     * Stadt.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonZufaelligeStadt(View view) {

        Intent intent = new Intent(this, ArrayRessourcenActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, lädt {@link ZweiQualifiziererActivity}
     * zu Anzeige einer aus einer Array-Ressource zufällig gewählten
     * Stadt.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonZweiQualifizierer(View view) {

        Intent intent = new Intent(this, ZweiQualifiziererActivity.class);
        startActivity(intent);
    }

}
