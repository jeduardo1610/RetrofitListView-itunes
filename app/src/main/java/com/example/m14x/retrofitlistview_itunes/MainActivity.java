package com.example.m14x.retrofitlistview_itunes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.m14x.retrofitlistview_itunes.Controller.CustomAdapter;
import com.example.m14x.retrofitlistview_itunes.Model.Pojo;
import com.example.m14x.retrofitlistview_itunes.Model.ResponseServer;
import com.example.m14x.retrofitlistview_itunes.Model.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Pojo> content = new ArrayList<>();
    private Call<ResponseServer> response;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        response = RetrofitInstance.apiService.getContent();
        response.enqueue(new Callback<ResponseServer>() {
            @Override
            public void onResponse(Call<ResponseServer> call, Response<ResponseServer> response) {
                Log.d("Test", response.body().toString());
                CustomAdapter adapter = new CustomAdapter(getApplicationContext(),R.layout.item,response.body().getResults());
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseServer> call, Throwable t) {

            }
        });

    }

}
