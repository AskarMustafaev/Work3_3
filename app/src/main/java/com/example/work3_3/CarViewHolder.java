package com.example.work3_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCar;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }

    void bind(String car){
        tvCar.setText(car);


    }


}
