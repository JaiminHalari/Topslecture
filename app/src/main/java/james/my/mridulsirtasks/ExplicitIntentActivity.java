package james.my.mridulsirtasks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicitintent);

        editText = findViewById(R.id.edt_dataid);
        button = findViewById(R.id.btn_showid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();

                Intent i25 = new Intent(ExplicitIntentActivity.this,ImplicitIntentActivity.class);
                i25.putExtra("data",data);
                startActivity(i25);

            }
        });
    }
}