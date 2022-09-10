package com.hrm.objectRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class AdminPageObjects {

	public FileInputStream fis = null;
    public Properties prop = null;

    public Properties getObjects(){

        try {
            FileInputStream fis = new FileInputStream("src//test//resource//adminPageObjects.properties");
			prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return prop;
    }
}
