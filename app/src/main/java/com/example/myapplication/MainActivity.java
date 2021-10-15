package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView responseText;
    APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText= findViewById(R.id.text);

        apiInterface = APIClient.getClient().create(APIInterface.class);


        /**
         GET List Resources
         **/
        Call<Setting> call = apiInterface.doGetSetting();
        call.enqueue(new Callback<Setting>() {
            @Override
            public void onResponse(Call<Setting> call, Response<Setting> response) {
                responseText.setText(""+response);

            }

            @Override
            public void onFailure(Call<Setting> call, Throwable t) {
                Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
            }
        });




    }
}