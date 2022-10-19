package com.example.delivery3000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Form_Cadastro extends AppCompatActivity {
    private EditText etNome, etEmail, etSenha;
    private Button btSlcFoto, btCadastrar;
    private CircleImageView imgFoto;
    private TextView txtMsgErro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
        iniciarComponentes();
        etNome.addTextChangedListener(cadastroTW);
        etEmail.addTextChangedListener(cadastroTW);
        etSenha.addTextChangedListener(cadastroTW);
    }

    private void iniciarComponentes() {
        etNome = findViewById(R.id.etCadNome);
        etEmail = findViewById(R.id.etCadEmail);
        etSenha = findViewById(R.id.etCadSenha);
        btSlcFoto = findViewById(R.id.btSelecFoto);
        btCadastrar = findViewById(R.id.btCadastrar);
        imgFoto = findViewById(R.id.fotoUsu);
        txtMsgErro = findViewById(R.id.txtErro);
    }

    TextWatcher cadastroTW = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String nome, email, senha;
            nome = etNome.getText().toString();
            email = etEmail.getText().toString();
            senha = etSenha.getText().toString();

            if (!nome.equals("") && !email.equals("") && !senha.equals("")){
                btCadastrar.setEnabled(true);
                btCadastrar.setBackgroundColor(getResources().getColor(R.color.dark_red));
            }else{
                btCadastrar.setEnabled(false);
                btCadastrar.setBackgroundColor(getResources().getColor(R.color.gray));
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}