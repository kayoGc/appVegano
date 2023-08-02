package br.com.etecia.appvegano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    Button btnEntrar, btnSair, btnCad;
    TextInputEditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);
        btnCad = findViewById(R.id.btnCad);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

    btnSair.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //finish();
        }
    });
    }
}