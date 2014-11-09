package com.example.dmitriy.mobconf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitriy on 29.10.2014.
 */
public class ReportListActivity extends Activity
{
    final String REPORT_TITLE = "title";
    final String REPORT_TIME = "time";
    final String REPORT_AUTHOR = "author";
    final String REPORT_ROOM = "room";

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportlist);
        list = (ListView) findViewById(R.id.listView);



        String[] Reports = { "World War 3", "Evolution of Apple", "True story about coding", "Boring development", "Lovely C++",
                            "Modern suicides", "Internet acquaintances"};
        String[] Authors = {"Pavel Malyarozov", "Tanyusha Buzhikova", "Kirill Chernega", "Katya Yakimchuk", "Dmitriy Sadoviy", "Ruslan Andrievsky", "Oxana Larionova"};

        String[] Times = {"11:18", "16:38", "14:40", "18:06", "03:03", "14:15", "23:59"};

        int Rooms[] = {404, 806, 401, 302, 309, 611, 201};


        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(Reports.length);
        Map<String, Object> m;
        for (int i = 0; i < Reports.length; i++) {
            m = new HashMap<String, Object>();
            m.put(REPORT_TITLE, Reports[i]);
            m.put(REPORT_AUTHOR, Authors[i]);
            m.put(REPORT_ROOM, Rooms[i]);
            m.put(REPORT_TIME, Times[i]);
            data.add(m);
        }

        String[] from = { REPORT_TITLE, REPORT_AUTHOR, REPORT_TIME, REPORT_ROOM };
        int[] to = { R.id.Title, R.id.Author, R.id.Time, R.id.Room };
        SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.replistview, from, to);

        list.setAdapter(sAdapter);
        list.setClickable(true);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ReportListActivity.this, ReportActivity.class));
            }
        });





        /*android.view.ViewGroup.LayoutParams layoutParams = list.getLayoutParams();
        layoutParams.width = 50;//this.getWindowManager().getDefaultDisplay().getHeight() * 4/5;
        list.setLayoutParams(layoutParams);*/
    }
    public void newReport(View view)
    {
        startActivity(new Intent(this, AddReportActivity.class));
    }
}
