package com.br.cursoalertdialog;

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

    public void abrir(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar título e mensagem
        dialog.setTitle("Título da Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Configura ações para SIM ou NÃO
        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar o botão SIM",
                        Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar o botão NÃO",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }


    public void abrirDialog(View view){

        //Instanciar a AlertDialog
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        //Configirar Título e Mensagem
        alertDialog.setTitle("Título 2");
        alertDialog.setMessage("Mensagem 2");

        //Configurar Cancelamento
        alertDialog.setCancelable(false);

        //Configurar Icone
        alertDialog.setIcon(android.R.drawable.ic_btn_speak_now);

        //Configura ações para SIM ou NÃO
        alertDialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação CONFIRMAR",
                        Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNegativeButton("Deletar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação DELETAR",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Criar e exibir AlertDialog
        alertDialog.create();
        alertDialog.show();
    }
}