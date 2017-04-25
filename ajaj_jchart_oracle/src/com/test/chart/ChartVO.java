package com.test.chart;
import java.io.Serializable;

//JSON 타입 변환 위해 Serializable 구현
public class ChartVO implements Serializable {

	private static final long serialVersionUID = 1L;	
	private String Xval;
	private double Yval;
	
	public ChartVO(){};
	public ChartVO(String xval, double yval) {
		super();
		Xval = xval;
		Yval = yval;
	}
	
	public String getXval() {
		return Xval;
	}
	public void setXval(String xval) {
		Xval = xval;
	}
	public double getYval() {
		return Yval;
	}
	public void setYval(double yval) {
		Yval = yval;
	}

}//end class
