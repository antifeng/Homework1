package Shape3D;

public class SingleSphere {

	/**
	 * @param args
	 */
	private static SingleSphere theInstance;
	
	private  SingleSphere()
	{
		System.out.println("SingleSphere constructor!");
	}
	
	public static synchronized SingleSphere getInstance(){
		if ( theInstance==null )
			theInstance = new SingleSphere();
		
		return theInstance;
	}
	
}
