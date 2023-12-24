package com.kundan.creationaldesignpatterns.singleton2;
/*Very simple to implement.
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
Exception handling is not possible.*/

public class S_1EagerInitialization {
	private static final S_1EagerInitialization SINGLE_INSTANCE = new S_1EagerInitialization();
	private S_1EagerInitialization() {
	}
	public static S_1EagerInitialization getInstance() {
 	return SINGLE_INSTANCE;
	}
}
