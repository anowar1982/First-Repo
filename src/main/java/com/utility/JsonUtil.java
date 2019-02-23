package com.utility;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtil {
public static JSONObject responseJson;

public static String getvalueByJpath(String Jpath){
	Object obj = responseJson;
	for (String s : Jpath.split("/")){
		if (!s.isEmpty()){
			obj = ((JSONObject)obj).get(s);
		}else{
			obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));
		}
	}
	return obj.toString();
}
	
}
