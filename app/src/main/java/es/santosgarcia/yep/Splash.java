package es.santosgarcia.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private TextView titulo;
    private TextView subtitulo;
    private final int milisec = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        titulo = (TextView)findViewById(R.id.titulo_principal);
        subtitulo = (TextView)findViewById(R.id.subtitulo);
        Typeface mitextocustom = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titulo.setTypeface(mitextocustom);
        subtitulo.setTypeface(mitextocustom);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion_titulo);
        titulo.startAnimation(animacion);

        empezarCuentaAtras();
    }

    private void empezarCuentaAtras() {
        new CountDownTimer(milisec, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                //mibarra.setProgress(establecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent nuevo = new Intent(Splash.this, Login.class);
                startActivity(nuevo);
                finish();
            }
        }.start();
    }



}
