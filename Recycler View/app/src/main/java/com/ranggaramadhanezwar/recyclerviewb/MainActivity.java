package com.ranggaramadhanezwar.recyclerviewb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
=======
import android.widget.Toast;

>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

<<<<<<< HEAD
import java.lang.reflect.Type;
=======
>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity
{
<<<<<<< HEAD
    private FloatingActionButton _addButton;
    private RecyclerView _recyclerView1;
=======
    private RecyclerView _recyclerview1;
>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);



        initAddButton();
        loadRecyclerView();
    }
    private void loadRecyclerView() {
        AsyncHttpClient ahc = new AsyncHttpClient();
        String url = "https://stmikpontianak.net/011108602/tampilMahasiswa.php";
=======
        _recyclerview1 = (RecyclerView) findViewById(R.id.recyclerView1);

        AsyncHttpClient ahc = new AsyncHttpClient();
        String url = "https://stmikpontianak.net/011100862/tampilMahasiswa.php";
>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73

        ahc.get(url, new AsyncHttpResponseHandler()
        {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody)
            {
                Gson g = new Gson();
                List<MahasiswaModel> mahasiswaModelList = g.fromJson(new String(responseBody), new TypeToken<List<MahasiswaModel>>(){}.getType());

<<<<<<< HEAD
                RecyclerView.LayoutManager lm = new LinearLayoutManager( MainActivity.this);
                _recyclerView1.setLayoutManager(lm);

                MahasiswaAdapter ma = new MahasiswaAdapter(mahasiswaModelList);
                _recyclerView1.setAdapter(ma);
=======
                RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
                _recyclerview1.setLayoutManager(lm);

                MahasiswaAdapter ma = new MahasiswaAdapter(mahasiswaModelList);
                _recyclerview1.setAdapter(ma);

>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error)
            {
<<<<<<< HEAD
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initAddButton() {
        _addButton = findViewById(R.id.addButton);

        _addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddMahasiswaActivity.class);
                startActivity(intent);
=======
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
>>>>>>> 857314f9d086450393f9330bf21042d6db4f6d73
            }
        });
    }
}