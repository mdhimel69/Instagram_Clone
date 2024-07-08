package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.instagramclone.R;

import Models.ProfileModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileRecycle_Adapter extends RecyclerView.Adapter<ProfileRecycle_Adapter.ViewHolder> {

    private List<ProfileModel> profileList;
    private Context context;

    public ProfileRecycle_Adapter(Context context, List<ProfileModel> profileList) {
        this.context = context;
        this.profileList = profileList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProfileModel profile = profileList.get(position);
        holder.profile.setImageResource(profile.getImageResource());
        holder.name.setText(profile.getName());
    }

    @Override
    public int getItemCount() {
        return profileList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profile;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.name);
        }
    }
}

