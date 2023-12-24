package com.kundan.creationaldesignpatterns.singleton2;

/*Lazy initialization is possible.
It is also thread safe.
getInstance() method is synchronized so it causes slow performance as 
multiple threads can’t access it simultaneously.*/

public class S_4ThreadSafeSingleton {

	private static S_4ThreadSafeSingleton instance = null;

	private S_4ThreadSafeSingleton() {
	}

	public static synchronized S_4ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new S_4ThreadSafeSingleton();
		}
		return instance;
	}
}
