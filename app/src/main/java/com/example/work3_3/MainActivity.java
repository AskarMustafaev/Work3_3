package com.example.work3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> carList;
    private RecyclerView recyclerView;
    private CarAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_car);
        loadData();
        adapter = new CarAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {

        carList = new ArrayList<>();
        carList.add("Mercedes");
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Ferrari");
        carList.add("Lamborgini");
        carList.add("Mazeraty");
        carList.add("Porshe");
        carList.add("Mitsubishi");
        carList.add("Subaru");
        carList.add("Kia");
        carList.add("Toyota");
        carList.add("Lexus");
    }
}