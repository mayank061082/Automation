   class Varaga {	
	  void show(String a,int b)
	 {
		 System.out.println("String int argument");
	 }
	  void show(int a,String b)
	  {
		  System.out.println("int string argumnet");
	  
   }
		
	static public void main(String[] args)
	{			
        Varaga v1=new Varaga();
	    v1.show(1,"a");
	    v1.show("a",'o');
	}
   }

 
  