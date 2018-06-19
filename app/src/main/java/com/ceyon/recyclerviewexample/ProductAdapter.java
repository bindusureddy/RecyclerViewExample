package com.ceyon.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private Context mCxt;
    private List<Product> productList;




    public ProductAdapter(Context mCxt, List<Product> productList){
        this.mCxt = mCxt;
        this.productList = productList;



    }
    



    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater =  LayoutInflater.from(mCxt);
        View view = layoutInflater.inflate(R.layout.list_item,null);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {


        Product product = productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
    class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTitle,textViewRating,textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView){
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);

        }

    }
}
