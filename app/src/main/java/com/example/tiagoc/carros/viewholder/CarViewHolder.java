package com.example.tiagoc.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.entities.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
    }

    public void bindData(Car car) {
        this.mTextModel.setText(car.model);
        this.mTextModel.setOnClickListener(null);
    }
}
