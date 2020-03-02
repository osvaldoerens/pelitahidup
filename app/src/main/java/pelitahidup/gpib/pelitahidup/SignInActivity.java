package pelitahidup.gpib.pelitahidup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button btnWlcmSignin = findViewById(R.id.btn_welcomesignin);
        btnWlcmSignin.setOnClickListener(this);

        TextView btnCreateAccount = findViewById(R.id.btn_new_account);
        btnCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_welcomesignin:
                Intent moveMain = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(moveMain);
                break;
            case R.id.btn_new_account:
                Intent moveCreateNew = new Intent(SignInActivity.this, RegisterActivity.class);
                startActivity(moveCreateNew);
                break;
        }
    }
}
