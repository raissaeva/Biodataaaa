package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtName, edtTTL, edtaddress, edthp, edtkegiatan, edtimpian;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtTTL = findViewById(R.id.edt_ttl);
        edtaddress = findViewById(R.id.edt_address);
        edthp = findViewById(R.id.edt_hp);
        edtkegiatan = findViewById(R.id.edt_kegiatan);
        edtimpian = findViewById(R.id.edt_impian);
        Button btnhasil = findViewById(R.id.btn_hasil);
        tvResult = findViewById(R.id.tv_result);

        btnhasil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hasil) {
            String inputName = edtName.getText().toString().trim();
            String inputTTL = edtTTL.getText().toString().trim();
            String inputaddress = edtaddress.getText().toString().trim();
            String inputhp = edthp.getText().toString().trim();
            String inputkegiatan = edtkegiatan.getText().toString().trim();
            String inputimpian = edtimpian.getText().toString().trim();

            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputName)) {
                isEmptyFields = true;
                edtName.setError("Field ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inputTTL)) {
                isEmptyFields = true;
                edtTTL.setError("Field ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inputaddress)) {
                isEmptyFields = true;
                edtaddress.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputhp)) {
                isEmptyFields = true;
                edthp.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputkegiatan)) {
                isEmptyFields = true;
                edtkegiatan.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputimpian)) {
                isEmptyFields = true;
                edtimpian.setError("Field ini tidak boleh kosong");
            }


            if (!isEmptyFields) ;
            tvResult.setText("=========\n" + "Informasi\t" + inputName +
                    "\t:" + "\nNama\t:" +inputName + "\nTanggal Lahir\t:" +
                    inputTTL + "\nAlamat\t:" + inputaddress + "\nNo HP\t:" +
                    inputhp + "\nHobby\t:" + inputkegiatan + "\nCita-Cita\t:" +
                    inputimpian + "\n========");
        }
    }
}