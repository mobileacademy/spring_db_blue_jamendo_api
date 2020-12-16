package com.myapp.jamendoapi;

import com.myapp.jamendoapi.models.artist.Artist;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("artists")
    public Call<Artist> getArtists(@Query("client_id") String clientId, @Query("name") String name);
}
