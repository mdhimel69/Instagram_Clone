// File: Fragments/SearchFragment.java
package Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.instagramclone.R;
import java.util.ArrayList;
import java.util.HashMap;
import Adapter.SearchGrid_Adapter;
import Models.SearchImageModel;


public class SearchFragment extends Fragment {

    GridView gridView;
    ArrayList<SearchImageModel> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_search, container, false);
        gridView = fragView.findViewById(R.id.gridView);

        createTable();

        SearchGrid_Adapter myAdapter = new SearchGrid_Adapter(getContext(), arrayList);
        gridView.setAdapter(myAdapter);

        return fragView;
    }


//================================================

    private void createTable() {
        arrayList.add(new SearchImageModel("https://d38b044pevnwc9.cloudfront.net/cutout-nuxt/enhancer/3.jpg"));
        arrayList.add(new SearchImageModel("https://imgv3.fotor.com/images/cover-photo-image/AI-illustration-of-a-dragon-by-Fotor-AI-text-to-image-generator.jpg"));
        arrayList.add(new SearchImageModel("https://instagram.fdac136-1.fna.fbcdn.net/v/t51.29350-15/449369456_1009590950621118_5991583652673846453_n.jpg?stp=dst-jpg_e15&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4yMjY4eDQwMzIuc2RyLmYyOTM1MCJ9&_nc_ht=instagram.fdac136-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=tQleYyNabhgQ7kNvgGR9--I&edm=AI8qBrIBAAAA&ccb=7-5&ig_cache_key=MzQwMTE3MDg3NDIzNjc3OTc0MA%3D%3D.2-ccb7-5&oh=00_AYBbiobWlavoAOJFiffBqCxf-8nfaqkAehLSFdTSALUgQw&oe=6689FFAD&_nc_sid=469e9a"));
        arrayList.add(new SearchImageModel("https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg"));
        arrayList.add(new SearchImageModel("https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg"));
        arrayList.add(new SearchImageModel("https://letsenhance.io/static/03620c83508fc72c6d2b218c7e304ba5/11499/UpscalerAfter.jpg"));
        arrayList.add(new SearchImageModel("https://instagram.fdac136-1.fna.fbcdn.net/v/t51.29350-15/444800181_952403800007004_3191879505171146594_n.jpg?stp=dst-jpg_e15&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi42NDB4MTEzOC5zZHIuZjI5MzUwIn0&_nc_ht=instagram.fdac136-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=R93pfOZHyuYQ7kNvgGlNE9d&edm=AI8qBrIBAAAA&ccb=7-5&ig_cache_key=MzM3MzAzNTExMjE4Mzc1MDM4Ng%3D%3D.2-ccb7-5&oh=00_AYBIn7ZgbSSsKnTEioBvZIGzv6PrROwJkZkK9xv1UOHAIg&oe=668A0D3C&_nc_sid=469e9a"));
        arrayList.add(new SearchImageModel("https://instagram.fdac136-1.fna.fbcdn.net/v/t51.29350-15/449615547_1154085625809907_1363565507627242612_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYyOTM1MCJ9&_nc_ht=instagram.fdac136-1.fna.fbcdn.net&_nc_cat=107&_nc_ohc=YbxQdUObBWcQ7kNvgH92FZ3&edm=AI8qBrIBAAAA&ccb=7-5&ig_cache_key=MzQwMjQ4OTYxNjU4MDYxMDM3Mg%3D%3D.2-ccb7-5&oh=00_AYA3BaPQLYwr90MXkByC-2orpqYAdIxbnV-Kn3v-f0W4KQ&oe=668A0AF3"));
    }
}