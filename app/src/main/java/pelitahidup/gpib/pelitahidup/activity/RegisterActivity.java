package pelitahidup.gpib.pelitahidup.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.presenter.Presenter;

public class RegisterActivity extends AppCompatActivity {

    private Button btRegistrasi;
    private Presenter mpresenter;
    private int id_user;
    private String username;
    private String password;
    private String email;
    private String nomor_telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btRegistrasi= findViewById(R.id.btnCreate);

        btRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initDataField();
                mpresenter = new Presenter();

            }
        });
    }

    private void initDataField() {

    }
}
