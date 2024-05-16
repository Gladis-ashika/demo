package garbageCollection;

public class GcEx {
	public void finalize() {
		System.out.println("object garbage is collected");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GcEx gc1=new GcEx();
		GcEx gc2=new GcEx();
		gc1=null;
		gc2=null;
		System.gc();		
}
}