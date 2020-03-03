package pelitahidup.gpib.pelitahidup.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pelitahidup.gpib.pelitahidup.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnSignIn = findViewById(R.id.welcomesignin);
        btnSignIn.setOnClickListener(this);

        Button btnCreateAccount = findViewById(R.id.btn_new_account);
        btnCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.welcomesignin:
                Intent moveSignIn = new Intent(WelcomeActivity.this, SignInActivity.class);
                startActivity(moveSignIn);
                break;
            case R.id.btn_new_account:
                Intent moveRegis = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(moveRegis);
                break;
        }
    }
}