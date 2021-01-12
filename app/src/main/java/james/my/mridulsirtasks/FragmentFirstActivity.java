package james.my.mridulsirtasks;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFirstActivity extends Fragment {

    //object created
    LinearLayout linearLayout;
    EditText editText;
    Button button;
    FragmentCommunication fragmentCommunication;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentCommunication = (FragmentCommunication) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Create View object
        View view = inflater.inflate(R.layout.activity_fragment_first,container,false);

        //bind object to id
        linearLayout = view.findViewById(R.id.firstfragmentlayout);
        editText = view.findViewById(R.id.edt_enter_id);
        button = view.findViewById(R.id.btn_send_id);

        //button onclick listner created
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = editText.getText().toString();
                fragmentCommunication.sendData(message);

                linearLayout.setBackgroundColor(Color.GREEN);

            }
        });

        return view;  //return view
    }

    //created interface
    interface FragmentCommunication
    {
     void sendData(String msg);
    }

}