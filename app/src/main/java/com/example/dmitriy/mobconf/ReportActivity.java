package com.example.dmitriy.mobconf;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Dmitriy on 07.11.2014.
 */
public class ReportActivity extends Activity
{
    TextView t;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        t = (TextView)findViewById(R.id.textAuthor);
        RelativeLayout.LayoutParams pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 10, 0, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.textTitle);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.textTime);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 0, 0, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.textAuthor);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.textRoom);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 0, 0, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.textTime);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.textReport);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 30, 30, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.textRoom);
        pr.addRule(RelativeLayout.ABOVE, R.id.NoteButton);
        t.setLayoutParams(pr);
    }
}
