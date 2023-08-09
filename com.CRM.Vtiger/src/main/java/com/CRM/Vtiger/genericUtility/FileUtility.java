package com.CRM.Vtiger.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromProperty(String data) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/ CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(data);
		return value;
	}

}
