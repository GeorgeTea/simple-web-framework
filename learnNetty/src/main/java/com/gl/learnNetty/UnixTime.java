package com.gl.learnNetty;

import java.util.Date;

public class UnixTime {
	
	private final long value;
	
	public UnixTime(){
		this(System.currentTimeMillis() / 1000L);
	}
	
	public UnixTime(long value){
		this.value = value;
	}
	
	public long value(){
		return value;
	}

	@Override
	public String toString() {
		return new Date(value() * 1000L).toString();
	}
	
}
