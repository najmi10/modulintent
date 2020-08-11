package com.example.healthsave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJagaDiri = findViewById(R.id.btn_jaga_diri);
        Button btnCuciTangan = findViewById(R.id.btn_cuci_tangan);
        Button btnPakaiMasker = findViewById(R.id.btn_pakai_masker);
        Button btnHidupSehat = findViewById(R.id.btn_hidup_sehat);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_jaga_diri:
                break;
            case R.id.btn_cuci_tangan:
                break;
            case R.id.btn_pakai_masker:
                break;
            case R.id.btn_hidup_sehat:
                break;
        }
    }
}