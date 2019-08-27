package com.sar.user.reteofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder().baseUrl(Api.BASE_url).addConverterFactory(GsonConverterFactory.create()).build();
        Api api=retrofit.create(Api.class);
        final TextView textView=findViewById(R.id.text);
        Call<List<Model>> call=api.getmodel();
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                List<Model> calls=response.body();
                for(Model i : calls)
                {
                    textView.append(i.getColor().toString()+"\n");
                    textView.append(i.getValue().toString()+"\n");
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

            }
        });
    }
}
