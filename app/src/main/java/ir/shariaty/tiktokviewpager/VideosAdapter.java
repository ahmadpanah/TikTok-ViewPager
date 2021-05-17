package ir.shariaty.tiktokviewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.VideoViewHolder> {

    private List<VideoItem> mVideoItems;

    public VideosAdapter(List<VideoItem> mVideoItems) {
        this.mVideoItems = mVideoItems;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_videos_container , parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideosAdapter.VideoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class VideoViewHolder extends RecyclerView.ViewHolder {
        VideoView mVideoView;
        TextView txtTitle , txtDesc;
        ProgressBar mProgressBar;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            mVideoView = itemView.findViewById(R.id.videoView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDesc = itemView.findViewById(R.id.txtDesc);
            mProgressBar = itemView.findViewById(R.id.progressBar);
        }

        void setVideoData(VideoItem videoItem) {
            txtTitle.setText(videoItem.VideoTitle);
            txtDesc.setText(videoItem.VideoDesc);
            mVideoView.setVideoPath(videoItem.videoUrl);
            // Todo!!
            mVideoView.
        }

    }
}
