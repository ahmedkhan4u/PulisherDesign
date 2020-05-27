package com.softrasol.ahmed.pulisherdesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ahmed.pulisherdesign.Models.PublicationsModel;
import com.softrasol.ahmed.pulisherdesign.R;

import java.util.List;

public class PublicationsAdapter extends RecyclerView.Adapter<PublicationsAdapter.ViewHolder> {

    private Context context;
    private List<PublicationsModel> list;

    public PublicationsAdapter(Context context, List<PublicationsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.publications_items_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        PublicationsModel model = list.get(position);
        holder.mImgBookCover.setImageResource(model.getImgae());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImgBookCover;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgBookCover = itemView.findViewById(R.id.img_book_cover);
        }
    }
}
