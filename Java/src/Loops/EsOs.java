package Loops;

public class EsOs {

	public static void main(String[] args) {
		int x[]={3,2,4,3,2,6,5,1};
		int esum=0,osum=0;
		for(int i=0;i<x.length;i++)
		{
			//int d=x[i]%10;
			if(x[i]%2==0)
				esum++;
				//esum=esum+x[i];
			else if(x[i]%2==1)
			{
				osum++;
				//osum=osum+x[i];
			}
			//x[i]=x[i]/10;
		}
			System.out.println("even"+esum);
			System.out.println("Odd"+osum);
		}

	}
