class TicketTest{

public static void main(String a[]){

TicketBookings details=new TicketBookings();
details.setBookingId(1);
details.setNoOfSeats(56);
details.setSource("Telegram");
details.setDestination("singapur");
details.setDate("5-june");
details.setTimings("04:37");
details.setPnr(5);
details.setPrice(98.00);
details.setClasss(1);
details.setBookingType("online");
details.setTransportName("india");
System.out.println(details.getBookingId());
System.out.println(details.getNoOfSeats());
System.out.println(details.getSource());
System.out.println(details.getDestination());
System.out.println(details.getDate());
System.out.println(details.getTimings());
System.out.println(details.getPnr());
System.out.println(details.getClasss());
System.out.println(details.getPrice());
System.out.println(details.getBookingType());
System.out.println(details.getTransportName());

TicketBookings detail=new TicketBookings();
detail.setBookingId(2);
detail.setNoOfSeats(54);
detail.setSource("Instagram");
detail.setDestination("Delhi");
detail.setDate("9th-june");
detail.setTimings("09:37");
detail.setPnr(2);
detail.setPrice(3456.00);
detail.setClasss(2);
detail.setBookingType("offline");
detail.setTransportName("india");
System.out.println(detail.getBookingId());
System.out.println(detail.getNoOfSeats());
System.out.println(detail.getSource());
System.out.println(detail.getDestination());
System.out.println(detail.getDate());
System.out.println(detail.getTimings());
System.out.println(detail.getPnr());
System.out.println(detail.getClasss());
System.out.println(detail.getPrice());
System.out.println(detail.getBookingType());
System.out.println(detail.getTransportName());

TicketBookings details1=new TicketBookings();
details1.setBookingId(3);
details1.setNoOfSeats(876);
details1.setSource("Telegram");
details1.setDestination("Uganda");
details1.setDate("10-june");
details1.setTimings("8:54");
details1.setPnr(7);
details1.setPrice(23456.00);
details1.setClasss(1);
details1.setBookingType("online");
details1.setTransportName("india");
System.out.println(details1.getBookingId());
System.out.println(details1.getNoOfSeats());
System.out.println(details1.getSource());
System.out.println(details1.getDestination());
System.out.println(details1.getDate());
System.out.println(details1.getTimings());
System.out.println(details1.getPnr());
System.out.println(details1.getClasss());
System.out.println(details1.getPrice());
System.out.println(details1.getBookingType());
System.out.println(details1.getTransportName());
}
}