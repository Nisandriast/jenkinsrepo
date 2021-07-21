package com.in28minutes.springboot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class TestJa {

	public static void main(String[] args) throws IOException {
	List<String> f1 =	Files.lines(new File("A.txt").toPath()).collect(Collectors.toList());
	
	List<String> f2 = Files.lines(new File("B.txt").toPath()).collect(Collectors.toList());
	//Common
	for(String f: f1) {	
		for(int i=0;i<f2.size();i++) {		
			if(f.equals(f2.get(i))) {
			System.out.println(f);
			break;
			}
		}		
	}
	
	//A-B means It's in A but not in B
	System.out.println("\n Difference \n ");
	for(String f: f1) {	
		if(!f2.contains(f)) {
			System.out.println(f);
		}
		
		}		
	
	
	
	}

}
