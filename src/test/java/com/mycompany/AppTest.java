package com.mycompany;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Unit test for simple App.
 */
public class AppTest


{


	String currencyPair = "USDT_BTC";
	long start = 1517602220;
	long period = 14400;
	String url = "https://bittrex.com/Api/v2.0/pub/market/GetTicks?marketName=USDT-BTC&tickInterval=thirtyMin&_=1500915289433";

	public String get() throws IOException {
		URLConnection connection = new URL(String.format(url, currencyPair, start, period)).openConnection();
		//connection.setRequestProperty("Accept-Charset", "");


		return IOUtils.toString(connection.getInputStream(), "UTF-8");
	}


	@org.junit.Test
	public void someTest() throws IOException {

		String g = get();


//		ObjectMapper om = new ObjectMapper();
//
//
//		File file = new File("C:\\dev\\pol.json");
//		String string = FileUtils.readFileToString(file);
//		Candle[] cs = om.readValue(string, Candle[].class);
//
//
//		System.out.println("Processing... " + cs.length);
	}


}
