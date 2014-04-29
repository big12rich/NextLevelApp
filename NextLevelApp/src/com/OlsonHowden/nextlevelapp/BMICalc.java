 package com.OlsonHowden.nextlevelapp;

public class BMICalc {
	 private double bmiNum = 0;
	 private double weight = 0;
	 private double height = 0;
	    
	    public  void bmiNums(double weightLb, double heightIn)
	    {
	        weight = weightLb;
	        height = heightIn;
	        
	    }
	    
	    public double bmiCalc(double weightLb, double heightIn)
	    {
	        weight = weightLb;
	        height = heightIn;
	        bmiNum = ((weight/(height*height)*703));
	        return bmiNum;
	        
	    }
	    
	    public double bmi()
	    {
	        
	    	bmiNum = ((weight/(height*height)*703));
	        return bmiNum;
	    }
	    
	    public String bmiChart(){
	    	return "Underweight: BMI < 18.5 \r"
	    			+ "Normal: 18.5 <= BMI < 25 \r"
	    			+"Overweight: 25 <= BMI <30 \r"
	    			+"Obese: 30 <= BMI";
	    }
}
