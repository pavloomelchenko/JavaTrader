package com.mycompany.charting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by pomel on 2/4/2018.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Candle {
	/*{
  "date": 1405699200,
  "high": 0.0045388,
  "low": 0.00403001,
  "open": 0.00404545,
  "close": 0.00435873,
  "volume": 44.34555992,
  "quoteVolume": 10311.88079097,
  "weightedAverage": 0.00430043
}*/
	long date;
	double high;
	double low;
	double open;
	double close;
	double volume;

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
