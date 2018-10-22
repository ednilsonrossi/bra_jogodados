package br.com.ednilsonrossi.dadosbra.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import br.com.ednilsonrossi.dadosbra.R;
import br.com.ednilsonrossi.dadosbra.model.Dado;

public class Main2Activity extends AppCompatActivity {

    private Dado dado;
    private ImageView imgDado;
    private int um, dois, tres, quatro, cinco, seis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dado = new Dado();
        um = dois = tres = quatro = cinco = seis = 0;
        imgDado = (ImageView) findViewById(R.id.imageDado);
    }

    public void jogar(View view){
        dado.lancar();
        mostrarDado(dado.getFace());
    }

    private void mostrarDado(int face){
        int resource = R.drawable.um;
        switch (face){
            case 1:
                resource = R.drawable.um;
                um++;
                break;
            case 2:
                resource = R.drawable.dois;
                dois++;
                break;
            case 3:
                resource = R.drawable.tres;
                tres++;
                break;
            case 4:
                resource = R.drawable.quatro;
                quatro++;
                break;
            case 5:
                resource = R.drawable.cinco;
                cinco++;
                break;
            case 6:
                resource = R.drawable.seis;
                seis++;
                break;
        }

        imgDado.setImageDrawable(getResources().getDrawable(resource, null));
    }

    public void abrirEstatisticas(View view){
        Intent in = new Intent(this, EstatisticaActivity.class);
        in.putExtra("um", um);
        in.putExtra("dois", dois);
        in.putExtra("tres", tres);
        in.putExtra("quatro", quatro);
        in.putExtra("cinco", cinco);
        in.putExtra("seis", seis);
        startActivity(in);
    }
}
