package com.wordpress.zengeek.sipat;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    private TabHost th;
    private Button btnMorning;
    private Button btnEvening;
    private Button btnNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        th = (TabHost)findViewById(R.id.th);
        btnMorning = (Button)findViewById(R.id.btnMorning);
        btnEvening = (Button)findViewById(R.id.btnEvening);
        btnNight = (Button)findViewById(R.id.btnNight);

        btnMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(Html.fromHtml("<p><b>" + "Segunda" + "</b></p>" + "\nTipo:Palestra\nTema:Dengue\nHorário:10h\nPalestrante:Tony" +
                        "<p><b>" + "Terça" + "</b></p>" + "Tipo:Palestra\nTema:Fisoterapia/LER\nHorário:10h\nPalestrante:Silva\n\n" +
                        "<p><b>" + "Quarta" + "</b></p>" + "Tipo:Atividade\nTema:Fono\nHorário:9-12h\nPalestrante:Gislene\n\n" +
                        "<p><b>" + "Quinta" + "</b></p>" + "Tipo:Atividade\nTema:Odontologia\nHorário:9-12h\nPalestrante:Leandro"));
                dlg.setNeutralButton("Ok", null);
                dlg.show();


            }
        });
        btnEvening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(Html.fromHtml("<p><b>" + "Segunda" + "</b></p>" + "Tipo:Atividade\nTema:Fono\nHorário:14-16h\nPalestrante:Gislaine\n\n" +
                        "<p><b>" + "Terça" + "</b></p>" + "Tipo:Palestra\nTema:DENARC(conscientização sobre o uso indevido de narcóticos)\nHorário:16-17h\nPalestrante:Marcio Rodrigues\n\n" +
                        "<p><b>" + "Quarta" + "</b></p>" + "Tipo:Palestra\nTema:DST/AIDS/HIV/Sifilis\nHorário:14-15h\nPalestrante:Marilu\n\n" +
                        "<p><b>" + "Quinta" + "</b></p>" + "Tipo:Palestra\nTema:Orientação sobre sexualidade/mama/próstata\n Horário:14h\nPalestrante:Karina"));
                dlg.setNeutralButton("Ok", null);
                dlg.show();

            }
        });
        btnNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(Html.fromHtml("<p><b>" + "Segunda" + "</b></p>" + "Tipo:Palestra\nTema:Segurança do Trabalho\nHorário:19h\nPalestrante:Prof. Otávio\n\n" +
                        "<p><b>" + "Terça" + "</b></p>" + "Tipo:Palestra\nTema:Direção Defensiva\nHorário:19h\nPalestrante:Sr. Carlos Eduardo"));
                dlg.setNeutralButton("Ok", null);
                dlg.show();

            }
        });




        //Tab1 with a list of Talks(Palestras in Portuguese)
        th.setup();
        TabHost.TabSpec ts1 = th.newTabSpec("Tab1");
        ts1.setIndicator("Palestras");
        ts1.setContent(R.id.tab1);
        th.addTab(ts1);

        //Tab2 about SIPAT(it is event which have the focus of prevent accidents)
        th.setup();
        TabHost.TabSpec ts2 = th.newTabSpec("Tab2");
        ts2.setIndicator("O que é SIPAT");
        ts2.setContent(R.id.tab2);
        th.addTab(ts2);




    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.about:
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(Html.fromHtml("<p><b>" + "Créditos"+ "</b></p>"+"Guilherme Augusto Peixoto de Campos"+ "<p><b>" + "Professor Orientador:Clóvis de Souza Dias"+ "<p><b>" + "Organizador CIPA:Sérgio Stefan Barci" + "<p><b>" + "Mestre de Cerimômia: Osvaldo de D'Estefano Rosica"));
                dlg.setNeutralButton("Ok",null);
                dlg.show();





        }

        return super.onOptionsItemSelected(item);
    }


}
