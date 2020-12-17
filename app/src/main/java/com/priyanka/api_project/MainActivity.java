package com.priyanka.api_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        button=findViewById(R.id.button);
        queue= Volley.newRequestQueue(this);

//        String url = "https://jsonplaceholder.typicode.com/users";

        String url="https://cdn.eso.org/images/screen/eso1907a.jpg";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                StringRequest string = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        textView.setText(response.toString());
//
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        textView.setText("not worked " +error);
//
//                    }
//                });
//                queue.add(string);

//                JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null,
//                        new Response.Listener<JSONArray>() {
//                            @Override
//                            public void onResponse(JSONArray response) {
//
//                                for (int i = 0; i < response.length(); i++){
//
//                                    try {
//                                        JSONObject object = response.getJSONObject(i);
//                                        String id=object.getString("id");
//                                        String name=object.getString("name");
//                                        String username=object.getString("username");
//                                        textView.append(id+"\n"+name+"\n"+username+"\n");
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }
//                        }, new Response.ErrorListener() {
//                    @Overridee
//                    public void onErrorResponse(VolleyError error) {
//
//                    }
//                });
////                MySingletone.getInstance(getApplicationContext()).addToRequestQueue(objectRequest);

                //Image view

                ImageRequest request=new ImageRequest(url, new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        ImageView imageView=findViewById(R.id.image);
                        imageView.setImageBitmap(response);
                    }
                }, 900, 900, null, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

                queue.add(request);

            }});}}