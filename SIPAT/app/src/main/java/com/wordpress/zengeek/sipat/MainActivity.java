package com.wordpress.zengeek.sipat;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
                dlg.setMessage("Segunda\nTipo:Palestra\nTema:Dengue\nHorário:10h\nPalestrante:Tony\n\n"+
                               "Terça\nTipo:Palestra\nTema:Fisoterapia/LER\nHorário:10h\nPalestrante:Silva\n\n"+
                               "Quarta\nTipo:Atividade\nTema:Fono\nHorário:9-12h\nPalestrante:Gislene\n\n"+
                               "Quinta\nTipo:Atividade\nTema:Odontologia\nHorário:9-12h\nPalestrante:Leandro");
                dlg.setNeutralButton("Ok",null);
                dlg.show();


            }
        });
        btnEvening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
                dlg.setMessage("Segunda\nTipo:Atividade\nTema:Fono\nHorário:14-16h\nPalestrante:Gislaine\n\n"+
                        "Terça\nTipo:Palestra\nTema:DENARC(conscientização sobre o uso indevido de narcóticos)\nHorário:16-17h\nPalestrante:Marcio Rodrigues\n\n"+
                        "Quarta\nTipo:Palestra\nTema:DST/AIDS/HIV/Sifilis\nHorário:14-15h\nPalestrante:Marilu\n\n"+
                        "Quinta\nTipo:Palestra\nTema:Orientação sobre sexualidade/mama/próstata\n Horário:14h\nPalestrante:Karina");
                dlg.setNeutralButton("Ok",null);
                dlg.show();

            }
        });
        btnNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
                dlg.setMessage("Segunda\nTipo:Palestra\nTema:Segurança do Trabalho\nHorário:19h\nPalestrante:Prof. Otávio\n\n"+
                        "Terça\nTipo:Palestra\nTema:Direção Defensiva\nHorário:19h\nPalestrante:Sr. Carlos Eduardo");
                dlg.setNeutralButton("Ok",null);
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
        ts2.setIndicator("Sobre");
        ts2.setContent(R.id.tab2);
        th.addTab(ts2);

        //Tab2 about SIPAT(it is event which have the focus of prevent accidents)
        th.setup();
        TabHost.TabSpec ts3 = th.newTabSpec("Tab2");
        ts3.setIndicator("Créditos");
        ts3.setContent(R.id.tab3);
        th.addTab(ts3);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
