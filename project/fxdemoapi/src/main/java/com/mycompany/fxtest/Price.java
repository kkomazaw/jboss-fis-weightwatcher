package com.mycompany.fxtest;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
	private String instrument;
	private String time;
	private double bid;
	private double ask;
	private String status;

	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public double getAsk() {
		return ask;
	}
	public void setAsk(double ask) {
		this.ask = ask;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Tick [instrument=" + instrument + ", time=" + time + ", bid=" + bid + ", ask=" + ask + ", status="
				+ status + "]";
	}
	
	
}
