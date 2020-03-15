package pelitahidup.gpib.pelitahidup.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.model.User;
import pelitahidup.gpib.pelitahidup.model.Value;
import pelitahidup.gpib.pelitahidup.presenter.Presenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private Button btRegistrasi;
    private Presenter mpresenter;
    private int id_user;
    private String username;
    private String password;
    private String email;
    private String nomor_telepon;

    private EditText id_userEd, usernameEd, passwordEd, emailEd, nomor_teleponEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btRegistrasi = findViewById(R.id.btnCreate);

        //action untuk button registrasi
        btRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initDataField();
                mpresenter = new Presenter();

                //proses koneksi ke api
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setEmail(email);
                user.setNomor_telepon(nomor_telepon);
                Call<User> result = mpresenter.userService().tambahUser(user);
                result.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.code() != 200){
                            Toast.makeText(getApplicationContext(), "Tambah Data Gagal", Toast.LENGTH_LONG).show();
                            System.out.println("Gagal Menambah data" + response);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Tambah Data Berhasil", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Tambah Data Gagal", Toast.LENGTH_LONG).show();
                        System.out.println("Gagal Menambah data " + t);
                    }
                });
            }
        });
    }

    private void initDataField() {
        usernameEd          = findViewById(R.id.field_username);
        passwordEd          = findViewById(R.id.field_password);
        emailEd             = findViewById(R.id.field_email);
        nomor_teleponEd     = findViewById(R.id.field_pnumber);

        //assign nilai ke setiap variabel
        username            = usernameEd.getText().toString();
        password            = passwordEd.getText().toString();
        email               = emailEd.getText().toString();
        nomor_telepon       = nomor_teleponEd.getText().toString();
    }
}
