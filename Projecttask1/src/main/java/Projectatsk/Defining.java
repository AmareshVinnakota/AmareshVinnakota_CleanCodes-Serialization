package Projectatsk;
import java.lang.*;
public class Defining {
	
	
	
	public double simple(double prin,double  in,double  per )
	{
		double y=(prin*in*per)/100;
		
		return y;
	}
	public double  compound(double p,double  in,double  per )
	{
		double  y=p*(Math.pow((1+(in/100)),per));
		y=y-p;
		return y;
	}
	

}
