package com.example.savehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJagaDiri = findViewById(R.id.btn_jaga_diri);
        btnJagaDiri.setOnClickListener(this);
        Button btnCuciTangan = findViewById(R.id.btn_cuci_tangan);
        btnCuciTangan.setOnClickListener(this);
        Button btnPakaiMasker = findViewById(R.id.btn_pakai_masker);
        btnPakaiMasker.setOnClickListener(this);
        Button btnHidupSehat = findViewById(R.id.btn_hidup_sehat);
        btnHidupSehat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_jaga_diri:
                Intent moveJagaDiri = new Intent(MainActivity.this, MoveHealth.class);
                startActivity(moveJagaDiri);
                break;
            case R.id.btn_cuci_tangan:
                Intent moveCuciTangan = new Intent(MainActivity.this, MoveCuci.class);
                startActivity(moveCuciTangan);
                break;
            case R.id.btn_pakai_masker:
                Intent movePakaiMasker = new Intent(MainActivity.this, MoveMasker.class);
                startActivity(movePakaiMasker);
                break;
            case R.id.btn_hidup_sehat:
                Intent moveHidupSehat = new Intent(MainActivity.this, MoveHidup.class);
                startActivity(moveHidupSehat);
                break;
        }
    }
}