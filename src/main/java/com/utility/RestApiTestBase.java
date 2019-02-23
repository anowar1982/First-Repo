package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RestApiTestBase {
	public int response_status_code_200 = 200;
	public int response_status_code_400 = 400;
	public int response_status_code_500 = 500;
	public int response_status_code_600 = 600;
	
	
	public Properties prop;
	
	public RestApiTestBase() {
		try {
			prop = new Properties();
			File path = new File("E:\\Work\\mavenProjectFive\\config.properties");
			FileInputStream FIS = new FileInputStream(path);
			prop.load(FIS);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	
	
}
