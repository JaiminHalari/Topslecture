package james.my.mridulsirtasks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImplicitIntentActivity extends AppCompatActivity {

    EditText editTexturl;
    Button buttonsearch,buttonexplicitintent;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicitintent);

        editTexturl = findViewById(R.id.edt_urlid);
        buttonsearch = findViewById(R.id.btn_searchid);
        buttonexplicitintent = findViewById(R.id.btn_intentid);
        textView = findViewById(R.id.txt_showdata);

        buttonsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editTexturl.getText().toString();

                Intent i24 = new Intent();
                i24.setAction(Intent.ACTION_VIEW);
                i24.setData(Uri.parse(url));
                startActivity(i24);
            }
        });

        buttonexplicitintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i26 = new Intent(ImplicitIntentActivity.this,ExplicitIntentActivity.class);
                startActivity(i26);
            }
        });

        String data = getIntent().getStringExtra("data");
        textView.setText(data);
    }
}