package com.mobilecomponetlab.GisellaPutri.recyclerview;

import android.view.*;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mobilecomponetlab.GisellaPutri.R;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    List<String> data;
    public SimpleAdapter(List<String> d) { this.data = d; }

    @NonNull @Override
    public ViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( @NonNull ViewHolder h, int pos) {
        h.txt.setText(data.get(pos));
    }

    @Override
    public int getItemCount() { return data.size(); }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt;
        ViewHolder(View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.textItem);
        }
    }
}