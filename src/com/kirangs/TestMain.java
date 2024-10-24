package com.kirangs;

public class TestMain {

	public static void main(String[] args) {

		TestMain testMain = new TestMain();
		System.out.println(testMain.getMessageInstance());

		System.out.println("Objective : " + getMessage());
	}

	private static String getMessage() {

		return "Lets explore GIT";
	}

	private String getMessageInstance() {
		return "Instnace method";
	}
}
