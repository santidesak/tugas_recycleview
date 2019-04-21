package com.example.keajaibandunia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewKeajaibanDuniaAdapter extends RecyclerView.Adapter<CardViewKeajaibanDuniaAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<KeajaibanDunia> listKeajaibanDunia;
    private ArrayList<KeajaibanDunia> getListKeajaibanDunia() {
        return listKeajaibanDunia;
    }
    public void setListKeajaibanDunia(ArrayList<KeajaibanDunia> listKeajaibanDunia) {
        this.listKeajaibanDunia = listKeajaibanDunia;
    }
    public CardViewKeajaibanDuniaAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_keajaiban_dunia, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        KeajaibanDunia p = getListKeajaibanDunia().get(i);
        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemarks());
        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListKeajaibanDunia().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListKeajaibanDunia().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {

        return getListKeajaibanDunia().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}