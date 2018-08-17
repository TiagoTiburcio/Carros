package com.example.tiagoc.carros.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.adapter.CarsListAdapter;
import com.example.tiagoc.carros.constants.CarrosConstants;
import com.example.tiagoc.carros.data.CarMock;
import com.example.tiagoc.carros.entities.Car;
import com.example.tiagoc.carros.listener.OnListClickInterectionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        }
        CarMock carMock = new CarMock(this);
        List<Car> carlist = new ArrayList<>(carMock.getList());

        // passo 1 de 3 criar Recycler view - obte-la
        this.mViewHolder.recyclerCars = findViewById(R.id.recycler_cars);

        OnListClickInterectionListener listener = new OnListClickInterectionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarrosConstants.CARRO_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        };


        // passo 1 de 3 criar Recycler view - Criar Adapter
        CarsListAdapter carsListAdapter = new CarsListAdapter(carlist, listener);
        this.mViewHolder.recyclerCars.setAdapter(carsListAdapter);
        // passo 1 de 3 criar Recycler view - Definir Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}
