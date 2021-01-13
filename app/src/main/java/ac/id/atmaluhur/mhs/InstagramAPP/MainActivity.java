package ac.id.atmaluhur.mhs.InstagramAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button mBtn_login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mBtn_signup = (Button) findViewById(R.id.button_signup);

        mBtn_signup.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), SignupActivity.class);
            startActivity(iLogin);
        });
    }
}