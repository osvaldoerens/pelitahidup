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

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_visimisi:
                Intent btnMoveVS = new Intent(MainActivity.this, VisiMisiActivity.class);
                startActivity(btnMoveVS);
                break;
        }
    }
}