package in.dezyne.meetup;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Dezyne 2 on 10/19/2016.
 */

public class Categories extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_layout);

        LinearLayoutManager linearLayoutManager5
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView5 = (RecyclerView)findViewById(R.id.recyclerView5);
        ContentAdapter5 adapter5 = new ContentAdapter5(recyclerView5.getContext());
        recyclerView5.setAdapter(adapter5);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setLayoutManager(linearLayoutManager5);

        LinearLayoutManager linearLayoutManager6
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView6 = (RecyclerView)findViewById(R.id.recyclerView6);
        ContentAdapter6 adapter6 = new ContentAdapter6(recyclerView6.getContext());
        recyclerView6.setAdapter(adapter6);
        recyclerView6.setHasFixedSize(true);
        recyclerView6.setLayoutManager(linearLayoutManager6);
    }


    public class ViewHolder5 extends RecyclerView.ViewHolder
    {

        ImageView picture;

        public ViewHolder5(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_explore, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image_explore);
        }
    }

    public class ContentAdapter5 extends RecyclerView.Adapter<ViewHolder5>
    {
        private static final int LENGTH = 5;
        private final Drawable[] mPlacePictures;
        public ContentAdapter5(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_explore);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder5 onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder5(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder5 holder, int position) {
            Log.e("ContentAdapter", "onBindViewHolder() Called");
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        }
        @Override
        public int getItemCount() {
            Log.e("ContentAdapter", "getItemCount() Called");
            return LENGTH;
        }
    }

    public class ViewHolder6 extends RecyclerView.ViewHolder
    {

        ImageView picture;

        public ViewHolder6(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_explore, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image_explore);
        }
    }

    public class ContentAdapter6 extends RecyclerView.Adapter<ViewHolder6>
    {
        private static final int LENGTH = 5;
        private final Drawable[] mPlacePictures;
        public ContentAdapter6(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_explore_1);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder6 onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder6(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder6 holder, int position) {
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
