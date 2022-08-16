package br.edu.scl.ifsp.pdm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Formulario form = new Formulario();
                form.setNome(editNome.getText().toString());
                form.setTelefone(editTelefone.getText().toString());
                form.setEmail(editEmail.getText().toString());
                form.setIngressar(checkBox.isChecked());
                form.setSexo(String.valueOf(rdFemin.isChecked() ? rdFemin.getText() : rdMasc.getText()));
                form.setUf(((TextView) spinnerUf.getSelectedView()).getText().toString());
                Toast.makeText(MainActivity.this, form.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editTelefone.setText("");
                editEmail.setText("");
                editCidade.setText("");
                checkBox.setChecked(false);
                rdMasc.setChecked(false);
                rdFemin.setChecked(false);
                spinnerUf.setSelection(0);
            }
        });
    }
}
