package com.niswarth.testingexample;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.niswarth.testingexample.controller.TestController;
import com.niswarth.testingexample.service.TestService;

@WebMvcTest(TestController.class)
public class TestingService {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TestService service;

	@Test
	public void ServiceReturnMessage() throws Exception {
		when(service.greet()).thenReturn("Hello, Service");
		this.mockMvc.perform(get("/helloniswarth")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("HelloNiswarth")));
	}
	@Test
	public void ServiceReturnMessage1() throws Exception {
		when(service.greet()).thenReturn("Hello, Niswarth");
		this.mockMvc.perform(get("/helloniswarth")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Niswarth")));
	}
}
