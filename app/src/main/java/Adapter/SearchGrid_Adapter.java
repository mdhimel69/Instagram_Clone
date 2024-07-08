package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.instagramclone.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import Models.SearchImageModel;

public class SearchGrid_Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<SearchImageModel> arrayList;

    public SearchGrid_Adapter(Context context, ArrayList<SearchImageModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View myView = layoutInflater.inflate(R.layout.search_grid_design_layout, viewGroup, false);

        ImageView imageView = myView.findViewById(R.id.imageViewSearch);

        SearchImageModel searchImageModel = arrayList.get(i);
        String myUrl = searchImageModel.getImgUrl();


        Picasso.get()
                .load(myUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.reel)
                .into(imageView);

        return myView;
    }
}
