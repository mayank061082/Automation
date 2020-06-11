
public  class MetodOverriding {
	public void show()
	{
		System.out.println("i am in class Methodoverriding");
	}
	
	public static class Over extends MetodOverriding{
		public void show()
		{
			System.out.println("i am in class Over");
		}
	

	public static void main(String [] args) {
		//MetodOverriding mo=new MetodOverriding();
		//mo.show();
		
		MetodOverriding ov=new Over();
		ov.show();

	}
	}
}
