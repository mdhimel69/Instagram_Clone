// File: Models/HomePostModel.java
package Models;

public class HomePostModel {
    private String channelName;
    private String songName;
    private String description;
    private String tags;
    private String comments;
    private String likes;
    private String profileImage;
    private String imageUrl;

    public HomePostModel(String channelName, String songName, String description, String tags, String comments, String likes, String profileImage, String imageUrl, String s) {
        this.channelName = channelName;
        this.songName = songName;
        this.description = description;
        this.tags = tags;
        this.comments = comments;
        this.likes = likes;
        this.profileImage = profileImage;
        this.imageUrl = imageUrl;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getSongName() {
        return songName;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public String getComments() {
        return comments;
    }

    public String getLikes() {
        return likes;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}