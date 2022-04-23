package com.schedule2.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();


    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.catphone,"Catphone  ","Design by Denis"));
        userList.add(new ModelClass(R.drawable.googlephone,"Google phone","Design by Denis"));
        userList.add(new ModelClass(R.drawable.huawei,"Huawei ","Design by Denis"));
        userList.add(new ModelClass(R.drawable.iphone13,"Apple iphone 13 ","Design by Denis"));
        userList.add(new ModelClass(R.drawable.samsung,"Samsung s22 ultra ","Design by Denis"));
        userList.add(new ModelClass(R.drawable.xiaomi,"Xiaomi sleek design","Design by Denis"));
        userList.add(new ModelClass(R.drawable.ztez20,"Zte z20 ","Design by Denis"));


    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}