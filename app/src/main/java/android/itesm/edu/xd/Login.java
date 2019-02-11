package android.itesm.edu.xd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAcount.class);
        startActivity(intent);

    }
    public void goSetType (View view){
        Intent intent = new Intent(this, TipoDCuenta.class);
        startActivity(intent);

    }
}
