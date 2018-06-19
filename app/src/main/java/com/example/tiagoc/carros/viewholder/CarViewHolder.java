package com.example.tiagoc.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.entities.Car;
import com.example.tiagoc.carros.listener.OnListClickInterectionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextCarModel;
    private ImageView mImgCarPic;
    private TextView mTextDetails;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mImgCarPic = (ImageView) itemView.findViewById(R.id.img_car_pic);
        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextDetails = (TextView) itemView.findViewById(R.id.text_car_detail);
    }

    public void bindData(final Car car, final OnListClickInterectionListener listener) {
        this.mTextCarModel.setText(car.model);
        this.mImgCarPic.setImageDrawable(car.picture);
        this.mTextDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });
    }
}
