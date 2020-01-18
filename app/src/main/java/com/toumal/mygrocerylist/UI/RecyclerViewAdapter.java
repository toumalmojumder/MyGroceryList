package com.toumal.mygrocerylist.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.toumal.mygrocerylist.Model.Grocery;
import com.toumal.mygrocerylist.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Grocery> groceryItems;

    public RecyclerViewAdapter(Context context, List<Grocery> groceryItems) {
        this.context = context;
        this.groceryItems = groceryItems;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Grocery grocery = groceryItems.get(position);
        holder.groceryItemName.setText(grocery.getName());
        holder.groceryItemQty.setText(grocery.getQuantity());
        holder.groceryItemDate.setText(grocery.getDateItemAdded());
    }

    @Override
    public int getItemCount() {
        return groceryItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView groceryItemName,groceryItemQty,groceryItemDate;
        public Button editButton,deleteButton;
        public int id;

        public ViewHolder(@NonNull View view,Context ctx) {
            super(view);
            context = ctx;
            groceryItemName = view.findViewById(R.id.name);
            groceryItemQty = view.findViewById(R.id.quantity);
            groceryItemDate = view.findViewById(R.id.dateAdded);
            editButton = view.findViewById(R.id.editButton);
            deleteButton = view.findViewById(R.id.deleteButton);

            editButton.setOnClickListener(this);
            deleteButton.setOnClickListener(this);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.editButton:
                    break;
                case R.id.deleteButton:
                    break;
            }
        }
    }
}
