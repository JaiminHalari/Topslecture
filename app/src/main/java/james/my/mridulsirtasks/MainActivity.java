package james.my.mridulsirtasks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b_login,b_intent,b_fragment,b_11janTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_login = findViewById(R.id.btn_login_id);
        b_intent = findViewById(R.id.btn_impintent_id);
        b_fragment = findViewById(R.id.btn_fragmentmain_id);
        b_11janTask = findViewById(R.id.btn_elevanjanuarytask_id);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i1);
            }
        });

        b_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,ImplicitIntentActivity.class);
                startActivity(i2);
            }
        });

        b_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this,FragmentMainActivity.class);
                startActivity(i3);
            }
        });

        b_11janTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this,ElevanjanuaryTask.class);
                startActivity(i4);
            }
        });

    }

}