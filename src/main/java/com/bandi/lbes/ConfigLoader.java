package com.bandi.lbes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.bandi.lbes.data.ConfigData;
import com.bandi.lbes.exception.IBESRuntimeException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigLoader {

	@Getter(lazy = true)
	private final static ConfigData configData = InitializeConfigData();

	public static Gson GSON = new GsonBuilder().create();

	private static ConfigData InitializeConfigData() {
		try {
			return GSON.fromJson(new String(Files.readAllBytes(Paths.get(Constants.CONFIG_LOCATION))),
					ConfigData.class);
		} catch (IOException e) {
			log.error("Exception occured while parsing file ", e);
			throw new IBESRuntimeException(e);
		}
	}
}
