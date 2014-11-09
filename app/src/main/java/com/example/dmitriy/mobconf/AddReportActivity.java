package com.example.dmitriy.mobconf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Dmitriy on 07.11.2014.
 */
public class AddReportActivity extends Activity
{
    TextView t;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addreport);

        t = (TextView)findViewById(R.id.DateText);
        RelativeLayout.LayoutParams pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 40, 10, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.textTitle);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.TimeText);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 10, 10, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.DateText);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.RoomText);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 10, 10, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.TimeText);
        t.setLayoutParams(pr);
        t = (TextView)findViewById(R.id.ReportText);
        pr = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        pr.setMargins(getWindowManager().getDefaultDisplay().getWidth()/7, 10, 10, 0);
        pr.addRule(RelativeLayout.BELOW, R.id.RoomText);
        pr.addRule(RelativeLayout.ABOVE, R.id.AddButton);
        t.setLayoutParams(pr);
    }
}
