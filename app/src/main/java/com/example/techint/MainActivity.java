package com.example.techint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.techint.Adapters.MainAdapter;
import com.example.techint.Models.MainModel;
import com.example.techint.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.thai,"Good Thai","AM","Navi Mumbai","4.5"));
        list.add(new MainModel(R.drawable.sushi,"Sushi Car","AM","Navi Mumbai","4.8"));
        list.add(new MainModel(R.drawable.pizza,"Pizza Box","AM","Navi Mumbai","4.2"));
        list.add(new MainModel(R.drawable.food,"Food Corner","AM","Navi Mumbai","4.3"));
        list.add(new MainModel(R.drawable.food,"french fries","AM","Navi Mumbai","4.3"));
        MainAdapter adapter=new MainAdapter(list,this);
        binding.rv.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.rv.setLayoutManager(layoutManager);

    }
}