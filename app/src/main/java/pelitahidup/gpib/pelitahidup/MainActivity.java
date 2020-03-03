package pelitahidup.gpib.pelitahidup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout btnMoveVS = findViewById(R.id.btn_visimisi);
        btnMoveVS.setOnClickListener(this);

        LinearLayout btnMoveDj = findViewById(R.id.btn_datajemaat);
        btnMoveDj.setOnClickListener(this);

        LinearLayout btnMoveIf = findViewById(R.id.btn_informasi);
        btnMoveIf.setOnClickListener(this);

        LinearLayout btnMoveJi = findViewById(R.id.btn_jadwalibadah);
        btnMoveJi.setOnClickListener(this);

        LinearLayout btnMoveWj = findViewById(R.id.btn_wartajemaat);
        btnMoveWj.setOnClickListener(this);

        LinearLayout btnMoveSbu = findViewById(R.id.btn_sbu);
        btnMoveSbu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //button pindah intent
        switch (view.getId()){
            case R.id.btn_visimisi:
                Intent btnMoveVS = new Intent(MainActivity.this, VisiMisiActivity.class);
                startActivity(btnMoveVS);
                break;
            case R.id.btn_datajemaat:
                Intent btnMoveDj = new Intent(MainActivity.this, DataJemaatActivity.class);
                startActivity(btnMoveDj);
                break;
            case R.id.btn_informasi:
                Intent btnMoveIf = new Intent(MainActivity.this, InformasiActivity.class);
                startActivity(btnMoveIf);
                break;
            case R.id.btn_jadwalibadah:
                Intent btnMoveJi = new Intent(MainActivity.this, JadwalIbadahActivity.class);
                startActivity(btnMoveJi);
                break;
            case R.id.btn_wartajemaat:
                Intent btnMoveWj = new Intent(MainActivity.this, WartaJemaatActivity.class);
                startActivity(btnMoveWj);
                break;
            case R.id.btn_sbu:
                Intent btnMoveSbu = new Intent(MainActivity.this, SbuActivity.class);
                startActivity(btnMoveSbu);
                break;
        }
    }
}