package in.dezyne.meetup;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainScreen.this,FabOnClickActivity.class);
                startActivity(intent);

            }
        });




        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager2
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = (RecyclerView)findViewById(R.id.recyclerView2);
        ContentAdapter2 adapter2 = new ContentAdapter2(recyclerView2.getContext());
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(linearLayoutManager2);

        LinearLayoutManager linearLayoutManager3
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView3 = (RecyclerView)findViewById(R.id.recyclerView3);
        ContentAdapter3 adapter3 = new ContentAdapter3(recyclerView3.getContext());
        recyclerView3.setAdapter(adapter3);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(linearLayoutManager3);

        LinearLayoutManager linearLayoutManager4
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView4 = (RecyclerView)findViewById(R.id.recyclerView4);
        ContentAdapter4 adapter4 = new ContentAdapter4(recyclerView4.getContext());
        recyclerView4.setAdapter(adapter4);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setLayoutManager(linearLayoutManager4);

        LinearLayoutManager linearLayoutManager5
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView5 = (RecyclerView)findViewById(R.id.recyclerView5);
        ContentAdapter5 adapter5 = new ContentAdapter5(recyclerView5.getContext());
        recyclerView5.setAdapter(adapter5);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setLayoutManager(linearLayoutManager5);

        LinearLayoutManager linearLayoutManager6
                = new LinearLayoutManager(MainScreen.this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView6 = (RecyclerView)findViewById(R.id.recyclerView6);
        ContentAdapter6 adapter6 = new ContentAdapter6(recyclerView6.getContext());
        recyclerView6.setAdapter(adapter6);
        recyclerView6.setHasFixedSize(true);
        recyclerView6.setLayoutManager(linearLayoutManager6);

    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView picture;
        ImageButton add1;

        ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_1, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image);
             add1 = (ImageButton)itemView.findViewById(R.id.add1);

           add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add1.setImageResource(R.drawable.join);

            }
        });

            //Detail_activity1 launches from here

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Detail_activity1.class);
                    intent.putExtra(Detail_activity1.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    public class ContentAdapter extends RecyclerView.Adapter<ViewHolder>
    {
        private static final int LENGTH = 5;
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

    public class ViewHolder2 extends RecyclerView.ViewHolder
    {

        ImageView picture;
        ImageButton add2;

        ViewHolder2(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_2, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image4);


            add2 = (ImageButton)itemView.findViewById(R.id.add2);
            add2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    add2.setImageResource(R.drawable.join);
                }
            });

            //Detail_activity2 launches from here

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Detail_activity2.class);
                    intent.putExtra(Detail_activity2.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    public class ContentAdapter2 extends RecyclerView.Adapter<ViewHolder2>
    {
        private static final int LENGTH = 5;
        private final Drawable[] mPlacePictures;
        public ContentAdapter2(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_2);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder2(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder2 holder, int position) {
            Log.e("ContentAdapter", "onBindViewHolder() Called");
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        }
        @Override
        public int getItemCount() {
            Log.e("ContentAdapter", "getItemCount() Called");
            return LENGTH;
        }
    }

    public class ViewHolder3 extends RecyclerView.ViewHolder
    {

        ImageView picture;
        ImageButton add3;

        ViewHolder3(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_3, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image4);

            add3 = (ImageButton)itemView.findViewById(R.id.add3);
            add3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    add3.setImageResource(R.drawable.join);
                }
            });

            //Detail_activity3 launches from here

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Detail_activity3.class);
                    intent.putExtra(Detail_activity3.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    public class ContentAdapter3 extends RecyclerView.Adapter<ViewHolder3>
    {
        private static final int LENGTH = 5;
        private final Drawable[] mPlacePictures;
        public ContentAdapter3(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_3);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder3 onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder3(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder3 holder, int position) {
            Log.e("ContentAdapter", "onBindViewHolder() Called");
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        }
        @Override
        public int getItemCount() {
            Log.e("ContentAdapter", "getItemCount() Called");
            return LENGTH;
        }
    }


    public class ViewHolder4 extends RecyclerView.ViewHolder
    {

        ImageView picture;
        ImageButton add4;

        ViewHolder4(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_4, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image4);

            add4 = (ImageButton)itemView.findViewById(R.id.add4);
            add4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    add4.setImageResource(R.drawable.join);
                }
            });


            //Detail_activity4 launches from here

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Detail_activity4.class);
                    intent.putExtra(Detail_activity4.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    public class ContentAdapter4 extends RecyclerView.Adapter<ViewHolder4>
    {
        private static final int LENGTH = 5;
        private final Drawable[] mPlacePictures;
        public ContentAdapter4(Context context) {
            Resources resources = context.getResources();
            TypedArray a = resources.obtainTypedArray(R.array.card_picture_4);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public ViewHolder4 onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.e("MainScreenAdapter","entering onCreateViewHolder()");
            return new ViewHolder4(LayoutInflater.from(parent.getContext()), parent);
        }
        @Override
        public void onBindViewHolder(ViewHolder4 holder, int position) {
            Log.e("ContentAdapter", "onBindViewHolder() Called");
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        }
        @Override
        public int getItemCount() {
            Log.e("ContentAdapter", "getItemCount() Called");
            return LENGTH;
        }
    }

    public class ViewHolder5 extends RecyclerView.ViewHolder
    {

        ImageView picture;

        ViewHolder5(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_explore, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image_explore);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Category_click_activity.class);
                    intent.putExtra(Category_click_activity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });

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

        ViewHolder6(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_layout_explore, parent, false));
            picture =(ImageView)itemView.findViewById(R.id.image_explore);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Category_click_activity.class);
                    intent.putExtra(Category_click_activity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_screen_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // One of the group items (using the onClick attribute) was clicked
        // The item parameter passed here indicates which item it is
        // All other menu item clicks are handled by onOptionsItemSelected()

        switch (item.getItemId()) {
            case R.id.profile:
                profile();
                return true;
            case R.id.notification:
                notification();
                return true;
            case R.id.add:
                add();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void add() {

        Intent intent = new Intent(MainScreen.this,Add_Activity.class);
        startActivity(intent);
    }

    private void notification() {
        Intent intent = new Intent(MainScreen.this,NotificationActivity.class);
        startActivity(intent);
    }

    private void profile() {
        Intent intent = new Intent(MainScreen.this,Profile_Activity.class);
        startActivity(intent);
    }
}


