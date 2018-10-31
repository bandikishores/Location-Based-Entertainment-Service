package com.bandi.lbes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class BeanConfiguration {

	@Bean("BingMapsRetro")
	public Retrofit createRetrofit() {
		return new Retrofit.Builder().baseUrl(Constants.BING_MAPS_URL)
				.addConverterFactory(GsonConverterFactory.create()).build();
	}

}
