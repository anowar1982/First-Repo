package com.rest.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.RestApiTestBase;

public class GetApiTest extends RestApiTestBase{
	RestApiTestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient; 
	
	@BeforeMethod
	public void setUp(){
		testBase = new RestApiTestBase();
		 serviceUrl = prop.getProperty("URL");
		 apiUrl = prop.getProperty("ServiceURL");
		 url = serviceUrl+apiUrl;	
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException{
		restClient = new RestClient();
		restClient.get(url);
	}
	

}
