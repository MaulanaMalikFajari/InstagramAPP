package ac.id.atmaluhur.mhs.InstagramAPP;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private Button mBtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mBtn_login = findViewById(R.id.button_login1);

        mBtn_login.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(iLogin);
        });
    }
}