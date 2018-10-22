package br.com.ednilsonrossi.dadosbra.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import br.com.ednilsonrossi.dadosbra.R;
import br.com.ednilsonrossi.dadosbra.model.Dado;

public class MainActivity extends AppCompatActivity {

    private Dado dado;
    private TextView labelSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado = new Dado();
        labelSorteado = (TextView) findViewById(R.id.labelSorteado);
    }

    public void clicou(View view) {
        String txtSaida;
        dado.lancar();
        txtSaida = "Face sorteada: " + dado.getFace();
        labelSorteado.setText(txtSaida);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_actmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.activity2:
                abrirJanela2();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void abrirJanela2(){
        Intent in = new Intent(this, Main2Activity.class);
        startActivity(in);
    }
}