package com.example.hw6;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final Context context;
    private final List<News> news;

    public NewsAdapter(Context context, List<News> news) {

        this.context = context;
        this.news = news;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.card, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final News newsItem = news.get(position);
        holder.newsImageView.setImageResource(newsItem.getPhoto());
        holder.newsTitleTextView.setText(newsItem.getTitle());
        holder.newsBodyTextView.setText(newsItem.getBody());
        holder.newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("photo", newsItem.getPhoto());
                intent.putExtra("title", newsItem.getTitle());
                intent.putExtra("body", newsItem.getBody());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView newsImageView;
        private TextView newsTitleTextView;
        private TextView newsBodyTextView;
        private Button newsButton;

        public ViewHolder(View itemView) {
            super(itemView);

            newsImageView = itemView.findViewById(R.id.news_image_view);
            newsTitleTextView = itemView.findViewById(R.id.news_title_text_view);
            newsBodyTextView = itemView.findViewById(R.id.news_body_text_view);
            newsButton = itemView.findViewById(R.id.news_button);
        }
    }
}
