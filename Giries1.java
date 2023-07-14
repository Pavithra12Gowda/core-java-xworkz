class Giries1{

	 public static void main(String arg[]){
	 
	 System.out.println("The main Started");
	 String electronicDevices[]={"refrigerator","wishing Machine","Television","LED","Grinder","Ac","IronBox","Microwave"};
	 
	 System.out.println(electronicDevices[0]+" "+electronicDevices[1]);
	 System.out.println("List of Electronic Devices are");
						//0<8 after index++ that value is 1 then go back to the index
	 for(int index=0;index<electronicDevices.length;){
	 System.out.println(electronicDevices[index]);
	 index++;
	
	 }
	  System.out.println("List of Electronic Devices are");
	 for(String electronicDevice : electronicDevices){
				//electronicDevice is a variable to store all string values from re to micro
	 
	 System.out.println(electronicDevice);
	 }
	 }

}