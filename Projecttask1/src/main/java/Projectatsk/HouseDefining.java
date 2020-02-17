package Projectatsk;

public class HouseDefining {
	double r1=0;
	double cost(String s,double r,String y)
	{
		if (s.equals("StandardMaterials"))
		{
			
			r1=r1+(1200*r);
			
			
		}
		
		else if (s.equals("above standard materials"))
		{
			
			r1=r1+(1500*r);
			
			
		}
		else
		{
			if (y.equals("fully automated home" ))
			{r1=r1+(2500*r);
			}
			else
			{
				r1=r1+(1800*r);
			}
			
		}
		
		
	return(r1);	
	}

}
