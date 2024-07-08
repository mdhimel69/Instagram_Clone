package Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.instagramclone.R;
import Adapter.ProfileRecycle_Adapter;
import Models.ProfileModel;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private TextView name;
    private List<ProfileModel> profileList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragView = inflater.inflate(R.layout.fragment_profile, container, false);

        initializeProfileList();

        recyclerView = fragView.findViewById(R.id.recyclerView);
        name = fragView.findViewById(R.id.name);

        name.setText("@arju_24k");

        ProfileRecycle_Adapter profileRecycleAdapter = new ProfileRecycle_Adapter(getActivity(), profileList);
        recyclerView.setAdapter(profileRecycleAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        return fragView;
    }

    private void initializeProfileList() {
        profileList.add(new ProfileModel(R.drawable.pro1, "Julker Nime"));
        profileList.add(new ProfileModel(R.drawable.pro7, "Tangir Tamin"));
        profileList.add(new ProfileModel(R.drawable.pro3, "Munshi Amiroul"));
        profileList.add(new ProfileModel(R.drawable.pro4, "Rabbir Hasan"));
        profileList.add(new ProfileModel(R.drawable.pro5, "Bodiyar Hasan"));
        profileList.add(new ProfileModel(R.drawable.pro8, "Ahasan Habib"));
        profileList.add(new ProfileModel(R.drawable.pro10, "Rabbi Khan"));
        profileList.add(new ProfileModel(R.drawable.pro7, "Arman Hasan"));
        profileList.add(new ProfileModel(R.drawable.pro12, "Sime Ahmed"));
    }
}
