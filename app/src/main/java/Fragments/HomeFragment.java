package Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.instagramclone.R;

import java.util.ArrayList;

import Adapter.HomeRecycle_Adapter;
import Models.HomePostModel;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<HomePostModel> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        createPosts();

        recyclerView = view.findViewById(R.id.recyclerView);
        HomeRecycle_Adapter homeRecycleAdapter = new HomeRecycle_Adapter(getContext(), arrayList);
        recyclerView.setAdapter(homeRecycleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }



    // flower class item/////////////////////////////////////////////////////////////


    public void createPosts() {
        arrayList = new ArrayList<>();

        // Layout Post
        arrayList.add(new HomePostModel(
                "LAYOUT",
                "",
                "",
                "",
                "",
                "5226",
                "",
                "",
                "#InstaGood..."));

        // Image Posts
        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic2,
                "SnapStories",
                "SnapFusion",
                "5226",
                "Capturing life's moments, one snap at a time.",
                "" + R.drawable.pic2,
                "" + R.drawable.pro1,
                "#InstaGood..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic3,
                "Midnight Serenade__5d",
                "TrendSetterGram",
                "5226",
                "Every picture tells a unique, beautiful story",
                "5k",
                "" + R.drawable.pro3,
                "#PhotoGram..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic4,
                "Echoes of Tomorrow__8h",
                "SnapJourney",
                "262",
                "Passion for photography, love for life",
                "12",
                "" + R.drawable.pro4,
                "#PhotoGram..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic5,
                "Starlit Skies__8d",
                "InstaMuse",
                "12k",
                "Capturing life's moments, one snap at a time.",
                "3k",
                "" + R.drawable.pro5,
                "#directselling..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic6,
                "Lost in Reverie__12d",
                "Moonlit Echoes",
                "5226",
                "Exploring the world, one photo per moment",
                "125",
                "" + R.drawable.pro8,
                "#InstaFollow..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic11,
                "Golden Hours__14h",
                "Moonlit Echoes",
                "1256",
                "Adventure awaits, capturing every precious moment",
                "4924",
                "" + R.drawable.pro10,
                "#InstaPhoto..."
        ));

        arrayList.add(new HomePostModel(
                "IMAGE",
                "" + R.drawable.pic7,
                "Radiant Reverie__7h",
                "TrendSetterGram",
                "5226",
                "Capturing life's moments, one snap at a time.",
                "2365",
                "" + R.drawable.pro12,
                "#MomentCaptured..."
        ));
    }

}