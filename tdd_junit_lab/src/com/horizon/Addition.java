package com.horizon;

public class Addition {
	
	public Addition() {}

	public int add(int i, int j) {
		if(i < 0 || j < 0) throw new NegativeIntegerException();
		return 0;
	}

}
