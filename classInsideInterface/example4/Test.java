interface Outer{
	public default void outerMethod1(){
		System.out.println("default interface method : OuterMethod() ");
	}
	class Inner{
		private int x;
		private int y;
		Inner(){
			x=10;
			y=20;
		}
		public void innerMethod(){
			System.out.println("inner class method inside interface : innerMethod() x:"+x+" y:"+y);
		}

	}

	public default void outerMethod2(){
		Inner i=new Inner();
		i.innerMethod();

	}

}


public class Test {

	public static void main(String[] args) {
		Outer.Inner i=new Outer.Inner();
		i.innerMethod();
	}

}