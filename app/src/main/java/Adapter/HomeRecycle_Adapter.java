// File: Adapter/HomeRecycle_Adapter.java
package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.instagramclone.R;
import java.util.ArrayList;

import Models.HomePostModel;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomeRecycle_Adapter extends RecyclerView.Adapter<HomeRecycle_Adapter.ImageViewHolder> {
    private Context context;
    private ArrayList<HomePostModel> arrayList;

    public HomeRecycle_Adapter(Context context, ArrayList<HomePostModel> postList) {
        this.context = context;
        this.arrayList = postList;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_layout, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        HomePostModel post = arrayList.get(position);

        if (post != null) {
            holder.channelName.setText(post.getChannelName() != null ? post.getChannelName() : "N/A");
            holder.songChannelName.setText((post.getSongName() != null ? post.getSongName() : "N/A") + "__" + (post.getChannelName() != null ? post.getChannelName() : "N/A"));
            holder.likes.setText(post.getLikes() != null ? post.getLikes() + " Likes" : "0 Likes");
            holder.description.setText(post.getDescription() != null ? post.getDescription() : "N/A");
            holder.comments.setText(post.getComments() != null ? "View all " + post.getComments() + " comments" : "View all 0 comments");

            try {
                // Check if profileImage and imageUrl are not empty before parsing
                if (post.getProfileImage() != null && !post.getProfileImage().isEmpty()) {
                    holder.profileImage.setImageResource(Integer.parseInt(post.getProfileImage()));
                } else {
                    holder.profileImage.setImageResource(R.drawable.pro5); // set a default image resource
                }

                if (post.getImageUrl() != null && !post.getImageUrl().isEmpty()) {
                    holder.imageView.setImageResource(Integer.parseInt(post.getImageUrl()));
                } else {
                    holder.imageView.setImageResource(R.drawable.reel); // set a default image resource
                }
            } catch (NumberFormatException e) {
                // Handle the case where the string cannot be parsed into an integer
                holder.profileImage.setImageResource(R.drawable.pro5); // set a default image resource
                holder.imageView.setImageResource(R.drawable.image1); // set a default image resource
            }

            holder.tags.setText(post.getTags() != null ? post.getTags() : "N/A");
        } else {
            // Handle the case where the post is null
            holder.channelName.setText("N/A");
            holder.songChannelName.setText("N/A__N/A");
            holder.likes.setText("0 Likes");
            holder.description.setText("N/A");
            holder.comments.setText("View all 0 comments");
            holder.profileImage.setImageResource(R.drawable.pro5); // set a default image resource
            holder.imageView.setImageResource(R.drawable.image1); // set a default image resource
            holder.tags.setText("N/A");
        }
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profileImage;
        TextView channelName, songChannelName, description, tags, comments, likes;
        ImageView imageView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile_image);
            channelName = itemView.findViewById(R.id.chanel_name);
            songChannelName = itemView.findViewById(R.id.song_chanelname);
            description = itemView.findViewById(R.id.description);
            tags = itemView.findViewById(R.id.hastag);
            comments = itemView.findViewById(R.id.comments);
            likes = itemView.findViewById(R.id.likes);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}