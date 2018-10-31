package com.bandi.lbes.bing.http;

import com.bandi.lbes.bing.data.BingMapsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IBingMapsHttp {

	@GET("/search/fuzzy/json?api-version=1.0")
	public Call<BingMapsResponse> getPOI(@Query("subscription-key") String subscriptionKey,
			@Query("lat") String latitude, @Query("lon") String longitude, @Query("query") String query);

}
