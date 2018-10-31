package com.bandi.lbes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

import com.bandi.lbes.data.ConfigData;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Make sure you've a file defined in {@link Constants.CONFIG_LOCATION} with
 * format as {@link ConfigData}
 * 
 * @author kibandi
 *
 */
@RestController
@EnableAutoConfiguration
@Slf4j
public class Application {

	public static void main(String[] args) {
		log.info("Subscription Found to be {} when loading", ConfigLoader.getConfigData().getSubscription());
		SpringApplication.run(Application.class, args);
	}

}
