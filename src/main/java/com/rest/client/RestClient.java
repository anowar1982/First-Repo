package com.rest.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
//https://www.youtube.com/watch?v=qwc5A55MIYU&list=PLFGoYjJG_fqp891lruz5fCRPWsDtEXJky&index=3
	
	// Get Method
	public void get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);	// http get request
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);  // hit the Get URL
		
		//a.  having Status code
		int statuscode = closableHttpResponse.getStatusLine().getStatusCode();		
		System.out.println("status code----> " +statuscode);
		
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
