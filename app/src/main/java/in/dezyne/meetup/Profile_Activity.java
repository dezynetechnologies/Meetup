package in.dezyne.meetup;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Profile_Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);


        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(Profile_Activity.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView5);
        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_screen_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // One of the group items (using the onClick attribute) was clicked
        // The item parameter passed here indicates which item it is
        // All other menu item clicks are handled by onOptionsItemSelected()

        switch (item.getItemId()) {
            case R.id.edit:
                return true;
            case R.id.refresh:
                return true;
            case R.id.menu:
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }









    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView picture;

        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_member, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.member_image);
        }
    }

    public class ContentAdapter extends RecyclerView.Adapter<ViewHolder>
    {
        private static final int LENGTH = 1;
        private final Drawable[] mPlacePictures;
        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_1);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Log.e("ContentAdapter", "onBindViewHolder() Called");
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        }
        @Override
        public int getItemCount() {
            Log.e("ContentAdapter", "getItemCount() Called");
            return LENGTH;
        }
    }

}
