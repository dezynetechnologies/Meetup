package in.dezyne.meetup;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;


public class SplashActivity extends Activity  {

    VideoView mVV;
    TextView login;
    static int seek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        login= (TextView)findViewById(R.id.login);
        mVV = (VideoView)findViewById(R.id.videoView);
        String videopath = "android.resource://"+getPackageName()+ "/"+ R.raw.movie;
        Uri uri = Uri.parse(videopath);
        mVV.setVideoURI(uri);
        mVV.start();
        mVV.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        seek = mVV.getCurrentPosition();
        mVV.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mVV.seekTo(seek);
        mVV.start();
    }
}
