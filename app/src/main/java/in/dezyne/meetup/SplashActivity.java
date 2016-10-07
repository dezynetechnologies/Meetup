package in.dezyne.meetup;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;


public class SplashActivity extends Activity  {

    VideoView mVV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);


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


    }


}
