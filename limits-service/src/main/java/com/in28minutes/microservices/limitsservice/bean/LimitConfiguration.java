package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximum;
	private int minimum;

	public int getMaximum() {
		return maximum;
	}

	protected LimitConfiguration() {
		super();
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

}
