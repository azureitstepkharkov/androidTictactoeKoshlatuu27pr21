package com.example.bohdanovskyi.ticactoe3.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.bohdanovskyi.ticactoe3.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.newGame).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.recTable).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ScoresActivity.class);
                startActivity(intent);
            }
        });
    }

    public void clickAboutButton(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Koshlatuu Sergey TicTacToe")
                .setTitle("About");

        AlertDialog dialog = builder.create();

        dialog.show();
    }
}