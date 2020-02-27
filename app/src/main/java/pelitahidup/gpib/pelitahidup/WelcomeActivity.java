package pelitahidup.gpib.pelitahidup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static pelitahidup.gpib.pelitahidup.R.*;

public class WelcomeActivity extends AppCompatActivity {

    public static Button pindahMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_welcome);

        Button button = (Button) findViewById(id.btn_signIn);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                    startActivity(intent);
                }
            });
    }
}
