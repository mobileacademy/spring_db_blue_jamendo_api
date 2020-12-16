package com.myapp.jamendoapi;

import com.myapp.jamendoapi.models.artist.Artist;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class RetrofitService {

    private RetrofitInterface retrofitInterface;

    public RetrofitService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConfigAPI.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitInterface = retrofit.create(RetrofitInterface.class);
    }

    public Artist getArtists(String name) throws IOException {
        System.out.println("--- Start Service method---");
        Call<Artist> call = retrofitInterface.getArtists(ConfigAPI.clientId, name);
        System.out.println("---URL: "+call.request().url());
        Response<Artist> response = call.execute();
        if (response.isSuccessful()){
            System.out.println(response.body());
            return response.body();
        } else {
            throw new IOException(String.valueOf(response.errorBody()));
        }
    }
}
