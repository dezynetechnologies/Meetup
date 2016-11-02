package in.dezyne.meetup;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dezyne 2 on 11/2/2016.
 */

public class Detail_activity2  extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout2);

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();


        TypedArray placePictures = resources.obtainTypedArray(R.array.card_picture_2);
        ImageView placePicutre = (ImageView) findViewById(R.id.image2);
        placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
        placePictures.recycle();


        String[] placeDetails = resources.getStringArray(R.array.place_details);
        TextView placeDetail = (TextView) findViewById(R.id.place_detail2);
        placeDetail.setText(placeDetails[postion % placeDetails.length]);

        String[] placeLocations = resources.getStringArray(R.array.place_locations);
        TextView placeLocation = (TextView) findViewById(R.id.place_location2);
        placeLocation.setText(placeLocations[postion % placeLocations.length]);

    }
}
