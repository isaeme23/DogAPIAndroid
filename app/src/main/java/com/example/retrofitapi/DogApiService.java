package com.example.retrofitapi;

import retrofit2.Call;
import retrofit2.http.GET;
public interface DogApiService {

    @GET("breeds/image/random")
    Call<DogResponse> getRandomDogImage();
}
