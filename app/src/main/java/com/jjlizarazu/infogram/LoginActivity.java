package com.jjlizarazu.infogram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jjlizarazu.infogram.view.ContainerActivity;
import com.jjlizarazu.infogram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hacemos que la app ocupe toda la pantalla, dibujándose detrás de la barra de estado
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        setContentView(R.layout.activity_login);

        // Hacemos la barra de estado completamente transparente
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(android.graphics.Color.TRANSPARENT);
        }
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}