package com.example.studikasus;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtName, edtLahir, edtTgl, edtAlamat, edtNomor,
    edtHobi, edtIngin;
    private Button btnProses;
    private TextView tvTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtLahir = findViewById(R.id.edt_lahir);
        edtTgl = findViewById(R.id.edt_tgl);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtNomor = findViewById(R.id.edt_nomor);
        edtHobi = findViewById(R.id.edt_hobi);
        edtIngin = findViewById(R.id.edt_ingin);
        btnProses = findViewById(R.id.btn_proses);
        tvTampil = findViewById(R.id.tv_tampil);

        btnProses.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_proses) {
            String inputName = edtName.getText().toString();
            String inputLahir = edtLahir.getText().toString();
            String inputTgl = edtTgl.getText().toString();
            String inputAlamat = edtAlamat.getText().toString();
            String inputNomor = edtNomor.getText().toString();
            String inputHobi = edtHobi.getText().toString();
            String inputIngin = edtIngin.getText().toString();

            boolean isEmptyField = false;

            if (TextUtils.isEmpty(inputName)) {
                isEmptyField = true;
                edtName.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputLahir)) {
                isEmptyField = true;
                edtLahir.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputTgl)) {
                isEmptyField = true;
                edtTgl.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputAlamat)) {
                isEmptyField = true;
                edtAlamat.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputNomor)) {
                isEmptyField = true;
                edtNomor.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputHobi)) {
                isEmptyField = true;
                edtHobi.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputIngin)) {
                isEmptyField = true;
                edtIngin.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyField) {
                tvTampil.setText("Nama :" + inputName + "\n" + "Tempat Lahir :" + inputLahir + "\n" + "Tanggal Lahir :" + inputTgl + "\n" + "Alamat Rumah :" + inputAlamat + "\n" +
                        "Nomor Telepon :" + inputNomor + "\n" + "Hobi :" + inputHobi + "\n" + "Keinginan :" + inputIngin + "\n");
            }
        }

    }
}