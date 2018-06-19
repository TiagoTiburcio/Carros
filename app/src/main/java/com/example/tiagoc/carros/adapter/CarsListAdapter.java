package com.example.tiagoc.carros.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.entities.Car;
import com.example.tiagoc.carros.listener.OnListClickInterectionListener;
import com.example.tiagoc.carros.viewholder.CarViewHolder;

import java.util.List;

public class CarsListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCars;

    private OnListClickInterectionListener mOnListClickInterectionListener;

    public CarsListAdapter(List<Car> cars, OnListClickInterectionListener listener){
        this.mListCars = cars;
        this.mOnListClickInterectionListener = listener;
    }


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View CarsView = inflater.inflate(R.layout.row_car_list, parent, false);

        return new CarViewHolder(CarsView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = this.mListCars.get(position);
        holder.bindData(car, this.mOnListClickInterectionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();
    }
}
