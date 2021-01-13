package ac.id.atmaluhur.mhs.InstagramAPP;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SignupActivity extends AppCompatActivity {

    private Button mBtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        mBtn_login = findViewById(R.id.button_login);

        mBtn_login.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(iLogin);
        });
    }
}