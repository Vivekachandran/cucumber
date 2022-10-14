package org.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {
	@Before(order=2)
	public void bm1() {
		System.out.println("bm1");

	}
	@Before(order=1)
	public void bm2() {
		System.out.println("bm2");

	}
	@After(order=2)
	public void am1() {
		System.out.println("am1");

	}
	@After(order=1)
	public void am2() {
		System.out.println("am2");

	}
}
