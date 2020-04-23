package com.example.iconchange;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.SubscriptSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.codesgood.views.JustifiedTextView;

public class Chapter1Fragment extends Fragment
{

    private RadioButton rg1_rb3,rg2_rb2,rg3_rb4,rg4_rb3,rg5_rb4,rg6_rb2,rg7_rb1,rg8_rb3,rg9_rb4,rg10_rb3;
    private TextView rg1_tv,rg2_tv,rg3_tv,rg4_tv,rg5_tv,rg6_tv,rg7_tv,rg8_tv,rg9_tv,rg10_tv;
    private Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chapter1, container, false);

        onClickListenerButton(view);

        btn_submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                rg1_tv.setText(rg1_rb3.isChecked() ? "Result: True,You Selected the Correct Answer" : " Result: False,The Correct Answer is 3rd Option");
                rg2_tv.setText(rg2_rb2.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 2nd Option");
                rg3_tv.setText(rg3_rb4.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 4th Option");
                rg4_tv.setText(rg4_rb3.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 3rd Option");
                rg5_tv.setText(rg5_rb4.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 4th Option");
                rg6_tv.setText(rg6_rb2.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 2nd Option");
                rg7_tv.setText(rg7_rb1.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 1st Option");
                rg8_tv.setText(rg8_rb3.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 3rd Option");
                rg9_tv.setText(rg9_rb4.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 4th Option");
                rg10_tv.setText(rg10_rb3.isChecked() ? "Result: True,You Selected the Correct Answer" : "Result: False,The Correct Answer is 3rd Option");

            }
        });

        return view;
    }

    private void onClickListenerButton(View view)
    {
        btn_submit = (Button) view.findViewById(R.id.btn_submit);

        rg1_rb3 = (RadioButton) view.findViewById(R.id.rg1_rb3);
        rg2_rb2 = (RadioButton) view.findViewById(R.id.rg2_rb2);
        rg3_rb4 = (RadioButton) view.findViewById(R.id.rg3_rb4);
        rg4_rb3 = (RadioButton) view.findViewById(R.id.rg4_rb3);
        rg5_rb4 = (RadioButton) view.findViewById(R.id.rg5_rb4);
        rg6_rb2 = (RadioButton) view.findViewById(R.id.rg6_rb2);
        rg7_rb1 = (RadioButton) view.findViewById(R.id.rg7_rb1);
        rg8_rb3 = (RadioButton) view.findViewById(R.id.rg8_rb3);
        rg9_rb4 = (RadioButton) view.findViewById(R.id.rg9_rb4);
        rg10_rb3 = (RadioButton) view.findViewById(R.id.rg10_rb3);

        rg1_tv = (TextView) view.findViewById(R.id.rg1_tv);
        rg2_tv = (TextView) view.findViewById(R.id.rg2_tv);
        rg3_tv = (TextView) view.findViewById(R.id.rg3_tv);
        rg4_tv = (TextView) view.findViewById(R.id.rg4_tv);
        rg5_tv = (TextView) view.findViewById(R.id.rg5_tv);
        rg6_tv = (TextView) view.findViewById(R.id.rg6_tv);
        rg7_tv = (TextView) view.findViewById(R.id.rg7_tv);
        rg8_tv = (TextView) view.findViewById(R.id.rg8_tv);
        rg9_tv = (TextView) view.findViewById(R.id.rg9_tv);
        rg10_tv = (TextView) view.findViewById(R.id.rg10_tv);
    }
}
