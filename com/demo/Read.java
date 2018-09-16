package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import com.demo.interpol.InterpolationMethod;

public class Read extends InterpolationHelper{

	public Read(String pathFile, double t, InterpolationMethod interpolationMethod) {
		super(pathFile, t, interpolationMethod);
		
	}
	
	public void readFile(){
		try {
			input = new FileReader(pathFile);   
		    /* Filter FileReader through a Buffered read to read a line at a time */
		    bufRead = new BufferedReader(input);
		   	// Read first line
		    String line = bufRead.readLine();
		    // Read through file one line at time.
		    while (line != null){
		    	xy = new StringTokenizer(line, "\t");
		    	while(xy.hasMoreTokens()) { 
		    		x.addElement(Double.parseDouble(xy.nextToken())); 
		    		y.addElement(Double.parseDouble(xy.nextToken())); 
		    	}
		    	line = bufRead.readLine();
		    }
		    bufRead.close();
		} catch (IOException e) {
		    // If another exception is generated, print a stack trace
		    e.printStackTrace();
		}
	}

}
