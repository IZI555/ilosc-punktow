package cwicznie;

public class main {
	public static void main(String[] args)
	{
		int[][] x=
			{
					{0,0,0,0},
					{0,0,0,1},
					{0,0,0,0},
					{1,0,0,0},
			};
		
		int iloscPunktow=0;
		int[][] punkty=new int [2][16];
		
		
		
		for(int  i = 0;i<x.length;i++)
		{
			for(int  j = 0;j<x.length;j++)
			{
				if(x[i][j]==1)
				{
					
					//System.out .println("Punkt ("+j+","+i+")");
					punkty[0][iloscPunktow]=j;
					punkty[1][iloscPunktow]=i;
					iloscPunktow++;
				
				}
			}
		}
		
		
		for(int  j = 0;j<iloscPunktow;j++)
		{
				System.out .println("Punkt ("+punkty[0][j]+","+punkty[1][j]+")");
		}
		
	}
	
}
