package com.kundan.creationaldesignpatterns.singleton2;

/*Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.
Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property.*/

public class S_2LazyInitialization {
	private static S_2LazyInitialization SINGLE_INSTANCE = null;
	private S_2LazyInitialization() {
	}
	public static S_2LazyInitialization getInstance() {
		if (SINGLE_INSTANCE == null) {
			SINGLE_INSTANCE = new S_2LazyInitialization();
		}
		return SINGLE_INSTANCE;
	}

}
