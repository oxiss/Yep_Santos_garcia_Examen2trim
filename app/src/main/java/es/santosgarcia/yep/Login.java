package es.santosgarcia.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private TextView titulo_login;
    private TextView subtitulo_login;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        titulo_login = (TextView) findViewById(R.id.titulo_principal_login);
        subtitulo_login = (TextView) findViewById(R.id.subtitulo_principal_login);
        Typeface mitextocustom = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titulo_login.setTypeface(mitextocustom);
        subtitulo_login.setTypeface(mitextocustom);

        btn_login = (Button) findViewById(R.id.buttonlogin);

        btn_login.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LoginButton();
                    }
                }
        );
}
    public void LoginButton() {
        Intent intent = new Intent(Login.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
