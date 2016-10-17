package in.dezyne.meetup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dezyne 2 on 10/17/2016.
 */

public class Add_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
