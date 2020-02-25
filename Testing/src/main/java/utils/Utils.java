package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	public String propertyRead(String path, String elements) {
		Properties propertyFile = new Properties();
		String data = null;
		propertyFile = new Properties();
		FileInputStream reader = null;
		try {
		reader = new FileInputStream(path);
		} catch (FileNotFoundException e) {

		e.printStackTrace();
		}
		try {
		propertyFile.load(reader);
		data = propertyFile.getProperty(elements);

		} catch (IOException e) {
		           e.printStackTrace();
		}
		return data;
		}
}
