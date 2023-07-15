class PrinterTest{

	public static void main(String s[]){
	//object creation in java
	//ClassName referenceVariable=new CalssName();
	System.out.println("Creating 1st copy of the Pen");
	Pen pen=new Pen();
	pen.branchName="nirmala";
	pen.price=10;
	pen.color="blue";
	pen.type="Fiber";
	pen.toSet();
	System.out.println(pen.branchName+" "+pen.price+" "+pen.color+" "+pen.type+" ");
	
	
	System.out.println("Creating 2st copy of the Pen");
	Pen pen1=new Pen();
	pen1.branchName="Doms";
	pen1.price=4;
	pen1.color="Black";
	pen1.type="plasic";
	pen1.toSet();
	System.out.println(pen1.branchName+" "+pen1.price+" "+pen1.color+" "+pen1.type+" ");
	
	}

}]