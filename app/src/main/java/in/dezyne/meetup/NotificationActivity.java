package in.dezyne.meetup;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by Dezyne 2 on 10/17/2016.
 */

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListView l1 = (ListView) findViewById(R.id.list1);
        String[] items = new String[] {"Item 1", "Item 2", "Item 3","Item 4","Item5"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        l1.setAdapter(adapter);

        ListView l2 = (ListView) findViewById(R.id.list2);
        String[] items2 = new String[] {"Item 1", "Item 2", "Item 3","Item 4","Item5"};
        ArrayAdapter<String> adapter2 =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2);

        l2.setAdapter(adapter2);

    }



}
