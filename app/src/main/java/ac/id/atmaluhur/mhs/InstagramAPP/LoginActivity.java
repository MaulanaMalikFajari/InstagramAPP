package ac.id.atmaluhur.mhs.InstagramAPP;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private Button mBtn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mBtn_signup = findViewById(R.id.button_login1);

        mBtn_signup.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(iLogin);
        });
    }
}