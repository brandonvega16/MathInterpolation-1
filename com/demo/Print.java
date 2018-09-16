package com.demo;

import com.demo.interpol.InterpolationMethod;

public class Print  extends InterpolationHelper{
	
	public Read file;

	public Print(String pathFile, double t, InterpolationMethod interpolationMethod) {
		super(pathFile, t, interpolationMethod);
		
	}

	public void getResult() {
		if(interpolationMethod != null) {
			file.readFile();
			System.out.println(interpolationMethod.toString());
			System.out.println("x = " + t + ",  f(x) = " + interpolationMethod.calculateResult(t, x, y));			
		} else {
			System.out.println("It is not defined an interpolation method.");
		}
	}
}
