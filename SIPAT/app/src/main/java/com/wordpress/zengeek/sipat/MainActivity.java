package com.wordpress.zengeek.sipat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        th = (TabHost)findViewById(R.id.th);

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
