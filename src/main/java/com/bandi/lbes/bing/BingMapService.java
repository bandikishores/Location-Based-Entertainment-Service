package com.bandi.lbes.bing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bandi.lbes.ConfigLoader;
import com.bandi.lbes.bing.data.BingMapsResponse;
import com.bandi.lbes.bing.http.IBingMapsHttp;

import retrofit2.Call;
import retrofit2.Retrofit;

@Service
public class BingMapService {

	private IBingMapsHttp bingMapsHttp;

	@Autowired
	public BingMapService(Retrofit bingMapsRetrofit) {
		bingMapsHttp = bingMapsRetrofit.create(IBingMapsHttp.class);
	}

	public String getPOIData() {
		Call<BingMapsResponse> poi = bingMapsHttp.getPOI(ConfigLoader.getConfigData().getPrimaryKey(), null, null, "Restaurants");
		
		return null;
	}
}
