class TicketBookings{

private int bookingId;
private int noOfSeats;
private String source;
private String destination;
private String date;
private String timings;
private int pnr;
private double price;
private int classs;
private String bookingType;
private String transportName;

public void setBookingId(int bookingId){
this.bookingId=bookingId;
}
public int getBookingId(){
return bookingId;
}
public void setNoOfSeats(int noOfSeats){
this.noOfSeats=noOfSeats;
}
public int getNoOfSeats(){
return noOfSeats;
}

public void setSource(String source){
this.source=source;
}
public String getSource(){
return source;
}
public void setDestination(String destination){
this.destination=destination;
}
public String getDestination(){
return destination;
}
public void setDate(String date){
this.date=date;
}
public String getDate(){
return date;
}
public void setTimings(String timings){
this.timings=timings;
}
public String getTimings(){
return timings;
}
public void setPnr(int pnr){
this.pnr=pnr;
}
public int getPnr(){
return pnr;
}
public void setPrice(double price){
this.price=price;
}
public double getPrice(){
return price;
}
public void setClasss(int classs){
this.classs=classs;
}
public int getClasss(){
return classs;
}
public void setBookingType(String bookingType){
this.bookingType=bookingType;
}
public  String getBookingType(){
return bookingType;
}
public void setTransportName(String transportName){
this.transportName=transportName;
}
public  String getTransportName(){
return transportName;
}
}