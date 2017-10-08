package com.spyfall.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<String> players;

    PlayersAdapter(Context context, ArrayList<String> players) {
        this.context = context;
        this.players = players;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {


        CustomViewHolder(View view) {
            super(view);
        }
    }
}
