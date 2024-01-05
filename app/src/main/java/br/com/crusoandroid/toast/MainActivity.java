package br.com.crusoandroid.toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view){
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso",
                Toast.LENGTH_LONG
        ).show();
    }

    public void abrirAlertDialog(View view){

        // Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder( this);
        //Configurar titulo e mensagem
        dialog.setTitle("titulo da dialog");
        dialog.setMessage("mensagem da Dialog");

        //configurar cancelamento
        dialog.setCancelable(true);

        //configurar icone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        // Configura acoes para sim e nao
        dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botao sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não ",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        //Criar e exibit AlertDialog
        dialog.create();
        dialog.show();

    }
}