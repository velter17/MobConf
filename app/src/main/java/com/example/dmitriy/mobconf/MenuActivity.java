package com.example.dmitriy.mobconf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.dmitriy.mobconf.R;

/**
 * Created by Dmitriy on 29.10.2014.
 */
public class MenuActivity extends Activity
{
    Button b[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        b = new Button[4];
        b[0] = (Button)findViewById(R.id.button);
        b[1] = (Button)findViewById(R.id.button2);
        b[2] = (Button)findViewById(R.id.button3);
        b[3] = (Button)findViewById(R.id.button4);
        ViewGroup.LayoutParams layoutParams = b[0].getLayoutParams();
        //int h = Math.min(layoutParams.height, layoutParams.width);
        layoutParams.width = Math.min(layoutParams.height, layoutParams.width);
        layoutParams.height = layoutParams.width;
        for(int i=0; i < 4; i++)
        {
            b[i].setLayoutParams(layoutParams);
        }

    }

    public void showReports(View view)
    {
        startActivity(new Intent(this, ReportListActivity.class));
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }*/

}
