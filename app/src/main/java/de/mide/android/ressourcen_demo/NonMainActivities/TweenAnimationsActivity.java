package de.mide.android.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import de.mide.android.ressourcen_demo.R;


/**
 * Activity zur Demonstration einer sog Tween-Animation
 * <a href="https://developer.android.com/guide/topics/resources/animation-resource#Tween">Tween-Animation</a>.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class TweenAnimationsActivity extends Activity {

    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_tween);
    }


    /**
     * Button-Event-Handler-Methode, wird in Layout-Datei über das
     * Attribut <code>onClick</code> direkt zugewiesen.
     * <br><br>
     *
     * Lädt die Animation als Ressource und holt dann die
     * Referenz auf das {@link ImageView}-Element, um
     * dann auf letzterem die Animation zu starten.
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onAnimationButton(View view) {

        Animation animation =
                AnimationUtils.loadAnimation( this,
                                              R.anim.tween_animation );

        ImageView imageView = findViewById( R.id.fotoImageView );

        imageView.startAnimation(animation);
    }

}
