package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    Properties prop;

    public void init(){
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("/Users/sami/git/restAPI_zeus/"
            +"Kratos_RestAssured/src/main/java/com/qa/config/config.properties");
            try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



    }
}
