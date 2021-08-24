package com.example.demo.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.models.Wheel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WheelService {
	private ObjectMapper mapper = new ObjectMapper();

	private Map<String, Wheel> wheels = new HashMap<>();

	public WheelService() {
		try {
			this.initWheels();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Map<String, Wheel> getWheels () {
		return this.wheels;
	}

	private void initWheels() throws JsonProcessingException {
		Set<String> fileList = this.getListOfFiles();
		for(String fileName : fileList) {
			turnFileIntoStream(fileName);
		}
	}

	private void turnFileIntoStream(String fileName) {
		String jsonContent = "";
		// transforms the json file into stream to be read as a string
		try (InputStream inputStream = getClass().getResourceAsStream("/wheels/" + fileName);
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			jsonContent = reader.lines().collect(Collectors.joining(System.lineSeparator()));
			addObjectToTheMap(jsonContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addObjectToTheMap(String jsonContent) throws JsonProcessingException {
		try {
			//read value extracted from json file and turn them into Wheel object
			Wheel wheel = mapper.readValue(jsonContent,Wheel.class);
			this.wheels.put(wheel.getName(), wheel);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Set<String> listFilesUsingFileWalk(String dir, int depth) throws IOException {
		try (Stream<Path> stream = Files.walk(Paths.get(dir), depth)) {
			return stream.filter(file -> !Files.isDirectory(file)).map(Path::getFileName).map(Path::toString)
					.collect(Collectors.toSet());
		}
	}

	public Set<String> getListOfFiles() {
		try {
			Set<String> test = this.listFilesUsingFileWalk("./src/main/resources/wheels", 1);
			return test;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
