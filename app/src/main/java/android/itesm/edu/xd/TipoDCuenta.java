package android.itesm.edu.xd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TipoDCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_dcuenta);
        showToolbar("Tipo de Cuenta", true);
    }

    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);


    }
    public void goDar(View view){
        Intent intent = new Intent(this, Descrip.class);
        startActivity(intent);

    }
    public void goRecibir(View view){
        Intent intent = new Intent(this, Donde.class);
        startActivity(intent);

    }

}
