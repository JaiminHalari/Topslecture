package james.my.mridulsirtasks;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ElevanjanuaryTask extends AppCompatActivity {

    TextView textResult;
    SeekBar seekBar;
    RadioGroup radioGroup;
    CheckBox checkBox1,checkBox2,checkBox3;
    Switch aSwitch;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevanjanuary_task);

        textResult = findViewById(R.id.text_result_id);
        seekBar = findViewById(R.id.seekbar_id);
        radioGroup = findViewById(R.id.radigroup_id);
        checkBox1 = findViewById(R.id.checkbox_first_id);
        checkBox2 = findViewById(R.id.checkbox_Second_id);
        checkBox3 = findViewById(R.id.checkbox_Third_id);
        aSwitch = findViewById(R.id.switch_id);
        ratingBar = findViewById(R.id.ratingbar_id);

        ratingBar.setRating(3.0F);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResult.setText("Progress :" + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                seekBar.animate();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBar.animate();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.radiobutton_first_id:
                        Toast.makeText(ElevanjanuaryTask.this, "First Radiobutton Selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radiobutton_second_id:
                        Toast.makeText(ElevanjanuaryTask.this, "Second Radiobutton Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 1 Checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 1 UnChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 2 Checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 2 UnChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 3 Checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Checkbox 3 UnChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Switch On", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ElevanjanuaryTask.this, "Switch Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textResult.setText("Rating :" + rating);
            }
        });
    }
}