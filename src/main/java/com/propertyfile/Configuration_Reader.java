package com.propertyfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {
		File pf = new File(
				"C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\src\\main\\java\\com\\propertyfile\\Adactinhotelbooking.properties");
		FileInputStream pfs = new FileInputStream(pf);
		p = new Properties();
		p.load(pfs);
	}
	public String getUrl() throws IOException {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() throws IOException {
		String Username = p.getProperty("Username");
		return Username;
	}
	public String getPassword() throws IOException {
		String Password = p.getProperty("Password");
		return Password;
	}
	public String getdatepick_in() {
		String getdatepick_in = p.getProperty("getdatepick_in");
		return getdatepick_in;
	}
	public String getdatepick_out() {
		String getdatepick_out = p.getProperty("getdatepick_out");
		return getdatepick_out;
	}
	public String getfirst_name() {
		String getfirst_name = p.getProperty("getfirst_name");
		return getfirst_name;
	}
	public String getlast_name() {
		String getlast_name = p.getProperty("getlast_name");
		return getlast_name;
	}
	public String getaddress() {
		String getaddress = p.getProperty("getaddress");
		return getaddress;
	}
	public String getcc_num() {
		String getcc_num = p.getProperty("getcc_num");
		return getcc_num;
	}
	public String getcc_cvv() {
		String getcc_cvv = p.getProperty("getcc_cvv");
		return getcc_cvv;
	}
}
