package br.com.ednilsonrossi.dadosbra.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.ednilsonrossi.dadosbra.R;

public class EstatisticaActivity extends AppCompatActivity {

    private int um, dois, tres, quatro, cinco, seis;
    private int total;
    private TextView tvUm;
    private TextView tvDois;
    private TextView tvTres;
    private TextView tvQuatro;
    private TextView tvCinco;
    private TextView tvSeis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatistica);

        tvUm = (TextView) findViewById(R.id.tvLado1);
        tvDois = (TextView) findViewById(R.id.tvLado2);
        tvTres = (TextView) findViewById(R.id.tvLado3);
        tvQuatro = (TextView) findViewById(R.id.tvLado4);
        tvCinco = (TextView) findViewById(R.id.tvLado5);
        tvSeis = (TextView) findViewById(R.id.tvLado6);

        recuperaArgumentos();
        mostraDados();
    }

    private void recuperaArgumentos(){
        Intent intent = getIntent();
        um = intent.getIntExtra("um", 0);
        dois = intent.getIntExtra("dois", 0);
        tres = intent.getIntExtra("tres", 0);
        quatro = intent.getIntExtra("quatro", 0);
        cinco = intent.getIntExtra("cinco", 0);
        seis = intent.getIntExtra("seis", 0);

        total = um + dois + tres + quatro + cinco + seis;
    }

    private void mostraDados(){
        tvUm.setText(um + "/" + total);
        tvDois.setText(dois + "/" + total);
        tvTres.setText(tres + "/" + total);
        tvQuatro.setText(quatro + "/" + total);
        tvCinco.setText(cinco + "/" + total);
        tvSeis.setText(seis + "/" + total);
    }

    public void fechar(View view){
        finish();
    }
}
