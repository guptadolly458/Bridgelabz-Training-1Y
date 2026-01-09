public class DEMO1{
	static int x=10;
	int y=10;
	public static void main(String[] args){
		int z=10;
	System.out.println("Local var z :" +z);
	System.out.println("Static var x :" +x);
	
    DEMO1 obj = new DEMO1();
	
	System.out.println("Non-static/instance var y:" +obj.y);
}
}
