package in.dezyne.meetup;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Dezyne 2 on 10/12/2016.
 */

public class FabOnClickActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_on_click_layout);


        ListView l3 = (ListView) findViewById(R.id.list3);
        String[] items = new String[] {"New Delhi", "Banglore", "Gurgaon","Pune","Mumbai"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        l3.setAdapter(adapter);

    }
     @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);

        SearchManager searchManager = (SearchManager) FabOnClickActivity.this.getSystemService(Context.SEARCH_SERVICE);

        SearchView searchView = null;
        if (searchItem != null) {
            searchView = (SearchView) searchItem.getActionView();


        }
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(FabOnClickActivity.this.getComponentName()));

        }
        return super.onCreateOptionsMenu(menu);
    }
}
