package com.example.tiagoc.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.constants.CarrosConstants;
import com.example.tiagoc.carros.data.CarMock;
import com.example.tiagoc.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        this.mCarMock = new CarMock(this);

        this.mViewHolder.textCarHorsePower = (TextView) findViewById(R.id.text_car_horse_power);
        this.mViewHolder.textCarModel = (TextView) findViewById(R.id.text_car_model);
        this.mViewHolder.textCarPrice = (TextView) findViewById(R.id.text_car_price);
        this.mViewHolder.textCarManfacture = (TextView) findViewById(R.id.text_car_manfacture);
        this.mViewHolder.imgCarPic = (ImageView) findViewById(R.id.img_car_pic);

        this.getDataFromActivity();
        this.setData();
    }

    private void setData() {
        this.mViewHolder.textCarPrice.setText(String.format("%s %s",getString(R.string.rs), String.valueOf(this.mCar.price)));
        this.mViewHolder.textCarHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textCarModel.setText(this.mCar.model);
        this.mViewHolder.textCarManfacture.setText(this.mCar.manfacturer);
        this.mViewHolder.imgCarPic.setImageDrawable(this.mCar.picture);
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosConstants.CARRO_ID));
        }
    }

    private static class ViewHolder {
        TextView textCarModel;
        TextView textCarHorsePower;
        TextView textCarPrice;
        TextView textCarManfacture;
        ImageView imgCarPic;

    }
}
