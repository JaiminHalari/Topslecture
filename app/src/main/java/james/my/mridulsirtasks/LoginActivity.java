package james.my.mridulsirtasks;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText editTextemail,editTextpassword;
    Button buttonsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextemail = findViewById(R.id.inputemailid);
        editTextpassword = findViewById(R.id.inputpasswordid);
        buttonsignin = findViewById(R.id.btn_signinid);

    }
}