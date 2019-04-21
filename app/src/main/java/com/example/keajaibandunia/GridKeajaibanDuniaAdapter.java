package com.example.keajaibandunia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKeajaibanDuniaAdapter extends RecyclerView.Adapter<GridKeajaibanDuniaAdapter.GridViewHolder>{
    private Context context;
    private ArrayList<KeajaibanDunia> listKeajaibanDunia;
    private ArrayList<KeajaibanDunia> getListKeajaibanDunia() {
        return listKeajaibanDunia;
    }
    public void setListKeajaibanDunia(ArrayList<KeajaibanDunia> listKeajaibanDunia) {
        this.listKeajaibanDunia = listKeajaibanDunia;
    }
    public GridKeajaibanDuniaAdapter(Context context) {
        this.context = context;
    }



    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_keajaiabandunia, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListKeajaibanDunia().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {

        return getListKeajaibanDunia().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
