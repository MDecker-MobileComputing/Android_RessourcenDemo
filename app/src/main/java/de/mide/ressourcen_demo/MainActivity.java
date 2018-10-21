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


/**
 * App demonstriert Verwendung von verschiedenen Ressourcen.
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
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen. Ruft die
     * zugehörige Activity mit einem expliziten Intent auf.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonSprachanpassung(View view) {

        Intent intent = new Intent(this, SprachanpassungsActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen. Ruft die
     * zugehörige Activity mit einem expliziten Intent auf.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonShapeAnzeigen(View view) {

        Intent intent = new Intent(this, ShapeAnzeigeActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen. Ruft die
     * zugehörige Activity mit einem expliziten Intent auf.
     * <br><br>
     *
     * Startet Activity mit Tween-Animation.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonTweenAnimation(View view) {

        Intent intent = new Intent(this, TweenAnimationsActivity.class);
        startActivity(intent);
    }


    /**
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen. Ruft die
     * zugehörige Activity mit einem expliziten Intent auf.
     * <br><br>
     *
     * Startet Activity mit Frame-Animation ("Daumenkino").
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonFrameAnimation(View view) {

        Intent intent = new Intent(this, FrameAnimationsActivity.class);
        startActivity(intent);
    }

    /**
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen. Ruft die
     * zugehörige Activity mit einem expliziten Intent auf.
     * <br><br>
     *
     * Startet Activity zur zufälligen Auswahl einer Stadt
     * aus einer Array-Ressource.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonZufaelligeStadt(View view) {

        Intent intent = new Intent(this, ArrayRessourcenActivity.class);
        startActivity(intent);
    }

}
