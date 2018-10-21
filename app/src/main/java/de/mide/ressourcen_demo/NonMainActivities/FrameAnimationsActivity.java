package de.mide.ressourcen_demo.NonMainActivities;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import de.mide.ressourcen_demo.R;


/**
 * Activity zur Demonstration einer Frame-Animation ("Daumenkino").
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class FrameAnimationsActivity extends Activity {

    /**
     * Objekt repräsentiert eine nach dem Daumenkino-Prinzip (Frame-Animation)
     * animierbare Grafik; wird in der Methode <code>onCreate()</code> gefüllt.
     */
    protected AnimationDrawable _animationDrawable = null;

    /** Button zum Start der Animation. */
    protected Button _startButton = null;

    /** Button zum Beenden der Animation. */
    protected Button _stopButton = null;


    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     * Füllt Member-Variable <code>_animationDrawable</code>.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_frame);


        _startButton = findViewById(R.id.startButton);

        _stopButton = findViewById(R.id.stopButton);
        _stopButton.setEnabled(false);

        ImageView imageView = findViewById(R.id.daumenkinoImageView);

        Drawable hintergrund = imageView.getBackground();

        if (hintergrund instanceof AnimationDrawable) {

            _animationDrawable = (AnimationDrawable)hintergrund;

        } else {

            _startButton.setEnabled(false);
            Toast.makeText(
                    this,
                    "Hintergrund-Bild ist kein AnimationDrawable",
                    Toast.LENGTH_LONG ).show();
        }
    }


    /**
     * Button-Event-Handler für Starten der Animation.
     * <br><br>
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonStartAnimation(View view) {

        if ( _animationDrawable != null) {

            _animationDrawable.start();

            _startButton.setEnabled(false);
            _stopButton.setEnabled(true);
        }
    }

    /**
     * Button-Event-Handler für Beenden der Animation.
     * <br><br>
     *
     * @param view  Button, der Event ausgelöst hat.
     */
    public void onButtonStopAnimation(View view) {

        if ( _animationDrawable != null) {

            _animationDrawable.stop();

            _startButton.setEnabled(true);
            _stopButton.setEnabled(false);
        }
    }

}
