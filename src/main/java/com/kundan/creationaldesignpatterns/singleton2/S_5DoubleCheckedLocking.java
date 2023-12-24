package com.kundan.creationaldesignpatterns.singleton2;

/*Lazy initialization is possible.
It is also thread safe.
Performance overhead gets reduced because of synchronized keyword.
First time, it can affect performance.*/

public class S_5DoubleCheckedLocking {

	private static S_5DoubleCheckedLocking instance = null;

	private S_5DoubleCheckedLocking() {
	}

	public static S_5DoubleCheckedLocking getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (S_5DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new S_5DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
