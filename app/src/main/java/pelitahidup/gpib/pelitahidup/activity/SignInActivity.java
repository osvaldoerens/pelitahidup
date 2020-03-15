package pelitahidup.gpib.pelitahidup.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.model.User;
import pelitahidup.gpib.pelitahidup.presenter.Presenter;
import pelitahidup.gpib.pelitahidup.service.UserServices;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    private Presenter mpresenter;
    private String username;
    private String password;

    private EditText usernameEd,passwordEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        usernameEd = findViewById(R.id.username);
        passwordEd = findViewById(R.id.password);

        Button btnWlcmSignin = findViewById(R.id.btn_signin);
        btnWlcmSignin.setOnClickListener(this);

        TextView btnCreateAccount = findViewById(R.id.btn_new_account);
        btnCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_signin:
                User user = new User();
                username = usernameEdgi .getText().toString();
                password = passwordEd.getText().toString();
                user.setUsername(username);
                user.setPassword(password);
                mpresenter = new Presenter();
                 Call<User> result = mpresenter.userService().userLogin(user);
                result.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.code() != 200){
                            Toast.makeText(getApplicationContext(), "Login gagal", Toast.LENGTH_LONG).show();
                            System.out.println("Login gagal" + response);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                            Intent moveMain = new Intent(SignInActivity.this, MainActivity.class);
                            startActivity(moveMain);
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Login User Gagal", Toast.LENGTH_LONG).show();
                        System.out.println("Login Gagal " + t);
                    }
                });
                break;
            case R.id.btn_new_account:
                Intent moveCreateNew = new Intent(SignInActivity.this, RegisterActivity.class);
                startActivity(moveCreateNew);
                break;
        }
    }
}
