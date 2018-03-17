package pe.edu.tecsup.labcalificado;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Segundoformulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundoformulario);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Segundoformulario.this, SplatchActivity.class));
            }
        }, 3000);

    }
}
