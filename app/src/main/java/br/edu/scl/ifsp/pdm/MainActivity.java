package br.edu.scl.ifsp.pdm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editTelefone;
    private EditText editEmail;
    private CheckBox checkBox;
    private RadioButton rdMasc;
    private RadioButton rdFemin;
    private EditText editCidade;
    private Spinner spinnerUf;

    private Button btnSalvar;
    private Button btnLimpar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editTelefone = findViewById(R.id.editTelefone);
        editEmail = findViewById(R.id.editEmail);
        checkBox = findViewById(R.id.checkBox);
        rdMasc = findViewById(R.id.rdMasc);
        rdFemin = findViewById(R.id.rdFemin);
        editCidade = findViewById(R.id.editCidade);
        spinnerUf = findViewById(R.id.spinnerUf);

        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);

    }
}
