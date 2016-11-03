package in.dezyne.meetup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dezyne 2 on 11/3/2016.
 */

public class Start_New_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_new_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
