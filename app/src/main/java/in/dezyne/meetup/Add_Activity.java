package in.dezyne.meetup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Add_Activity extends AppCompatActivity {

    Button start;
    TextView change;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        start = (Button)findViewById(R.id.startbutton);
        change = (TextView)findViewById(R.id.changelocation);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_Activity.this,Start_New_Activity.class);
                startActivity(intent);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_Activity.this,FabOnClickActivity.class);
                startActivity(intent);
            }
        });

    }
}
