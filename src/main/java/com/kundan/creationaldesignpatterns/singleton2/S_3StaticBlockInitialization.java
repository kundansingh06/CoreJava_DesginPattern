package com.kundan.creationaldesignpatterns.singleton2;

/*By using Static block in Eager initialization we can provide 
exception handling and also can control over instance.*/

public class S_3StaticBlockInitialization {
	private static S_3StaticBlockInitialization instance = null;

	private S_3StaticBlockInitialization() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new S_3StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static S_3StaticBlockInitialization getInstance() {
		return instance;
	}
}
