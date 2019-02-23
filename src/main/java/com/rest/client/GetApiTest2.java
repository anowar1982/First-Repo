package com.rest.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.RestApiTestBase;

public class GetApiTest2 extends RestApiTestBase{
	RestApiTestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient2 restClient2; 
	
	@BeforeMethod
	public void setUp(){
		testBase = new RestApiTestBase();
		 serviceUrl = prop.getProperty("URL");
		 apiUrl = prop.getProperty("ServiceURL");
		 url = serviceUrl+apiUrl;	
		 CloseableHttpResponse closableHttpResponse;
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException{
		restClient2 = new RestClient2();
		CloseableHttpResponse closableHttpResponse = restClient2.get(url);

		//a.  having Status code
		int statuscode = closableHttpResponse.getStatusLine().getStatusCode();		
		System.out.println("status code----> " +statuscode);
		Assert.assertEquals(statuscode, response_status_code_200, "Status code is not 200");
		
		//b. Json String
		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");		
		JSONObject ResponseJson = new JSONObject(responseString);				// getting Json body
		System.out.println("Resonponse JSON from API----> "+ ResponseJson);
		
		//c. all headers
		Header[] headerarray=  closableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for (Header header : headerarray){
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("headers array ----> "+allHeaders);
	}
	

}
