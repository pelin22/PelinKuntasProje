package com.example.proje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Button map=(Button)findViewById(R.id.mapbutton);
        map.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent map_gecis=new Intent(secondactivity.this,googlemap.class);
                startActivity(map_gecis);
                finish();
            }
        });
        Button message=(Button)findViewById(R.id.mesajbuton);
       message.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mesaj_gecis=new Intent(secondactivity.this,KolayMesaj.class);
               startActivity(mesaj_gecis);
               finish();
           }
       });

    }

}