package com.masai;

public class CheckWeather {

	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
       if(isRaining)
       {
    	   System.out.println("Let’s stay home. if its raining");
       }
       else if(isSnowing | temperature<50)
       {
    	   System.out.println("Let’s go out!");
       }

	}

}
