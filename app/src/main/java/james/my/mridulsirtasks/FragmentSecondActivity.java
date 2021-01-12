package james.my.mridulsirtasks;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSecondActivity extends Fragment {

    LinearLayout linearLayout;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_second,container,false);

        linearLayout = view.findViewById(R.id.secondfragmentlayout);
        textView = view.findViewById(R.id.txt_result_id);   //bind object to id

        return view;   //view return
    }

    //create display method
    public void DisplatData(String msg)
    {
        //text view in settext
        textView.setText("Received Data :" + msg);
        linearLayout.setBackgroundColor(Color.RED);
    }

}