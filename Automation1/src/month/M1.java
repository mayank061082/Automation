package month;

public class M1 {
	
	public void mon(int mon)
	{
		if(mon==1 ||mon==3 ||mon==5 ||mon==7 ||mon==8 ||mon==10 || mon==12)
		{
			System.out.println("Number of Days=31");
		}
		else if(mon==4 ||mon==6 ||mon==9 ||mon==11)
		{
			System.out.println("Number of Days =30");

		}
		else if(mon==2)
		{
			System.out.println("Number of days is 28 or 29");
		}
	}
		public void leep(int year)
		{
		if(year%4==0)
		{
			System.out.println("This year number of days in Feb is 29");
		}
		else if(year%4!=1)
		{
			System.out.println("This year number of days in feb is 28");
		}

	}
	

}
