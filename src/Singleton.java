
class Singleton {
  private static Singleton s;
  private Singleton(){
	  System.out.println("A Singleton Model example");
  }
  public static Singleton getSigleton()
  {
	   if(s==null)s=new Singleton();
	   return s;
  }
  
  public static void main(String[] args) {
	  Singleton.getSigleton();
	   
  }
  
  
}