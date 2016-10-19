package in.dezyne.meetup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Dezyne 2 on 10/19/2016.
 */

public class Forget_Password_Activity extends AppCompatActivity {

    Button send;
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        send= (Button)findViewById(R.id.send);
        mail=(EditText) findViewById(R.id.mail);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode(String.valueOf(mail.getText())) +
                        "?subject=" + Uri.encode("New Password") +
                        "&body=" + Uri.encode("Your new password is xxxxxxx");
                Uri uri = Uri.parse(uriText);

                send.setData(uri);
                Toast.makeText(getBaseContext(), "Mail Sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
