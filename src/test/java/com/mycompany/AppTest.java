package com.mycompany;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.binance.BinanceExchange;
import org.knowm.xchange.bitstamp.BitstampExchange;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.marketdata.MarketDataService;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 

{



    @org.junit.Test public void someTest() throws IOException {
        Exchange bitstamp = ExchangeFactory.INSTANCE.createExchange(BinanceExchange.class.getName());

        MarketDataService marketDataService = bitstamp.getMarketDataService();

        Ticker ticker = marketDataService.getTicker(CurrencyPair.BTC_USDT);

        System.out.println(ticker.toString());
    }
}
