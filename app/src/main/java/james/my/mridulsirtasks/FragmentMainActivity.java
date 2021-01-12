package james.my.mridulsirtasks;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentMainActivity extends AppCompatActivity implements FragmentFirstActivity.FragmentCommunication{

    FragmentManager fragmentManager;
    FragmentFirstActivity fragmentFirst;
    FragmentSecondActivity fragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        fragmentFirst = new FragmentFirstActivity();
        fragmentSecond = new FragmentSecondActivity();

        getSupportFragmentManager().beginTransaction().add(R.id.firstfragment_container_id,fragmentFirst,"First").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.secondfragment_container_id,fragmentSecond,"Second").commit();

    }

    public void sendData(String msg)
    {
        FragmentSecondActivity fragmentSecondActivity = (FragmentSecondActivity) getSupportFragmentManager().findFragmentByTag("Second");

        if (fragmentSecond != null)
        {
            fragmentSecond.DisplatData(msg);
        }
    }

}