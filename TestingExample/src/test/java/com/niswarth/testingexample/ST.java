package com.niswarth.testingexample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.niswarth.testingexample.controller.TestController;

public class ST {

	@Autowired
	private TestController testController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(testController).isNotNull();
	}

}
