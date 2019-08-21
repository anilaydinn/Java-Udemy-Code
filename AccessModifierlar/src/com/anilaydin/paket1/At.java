package com.anilaydin.paket1;

import com.anilaydin.paket2.Hayvan;

public class At extends Hayvan {

	public At(String isim) {
		
		super(isim);
	}
	
	public void ismini_soyle() {
		
		System.out.println(super.isim);
	}
}
