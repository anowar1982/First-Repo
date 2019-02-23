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

public class RestClient2 {
//https://www.youtube.com/watch?v=qwc5A55MIYU&list=PLFGoYjJG_fqp891lruz5fCRPWsDtEXJky&index=3
	
	// Get Method
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);	// http get request
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);  // hit the Get URL
		return closableHttpResponse;
	}
	
	
	
	
}
