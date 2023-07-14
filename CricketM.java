class CricketM{

static String top1BtM[]={"Babar Azam","Rassie van der dussen","David warner","virat kohli","rohith sharma","steve smith",
                          "Alex carey","rahmat shah","travis head","imam-ul-haq"};
static String top10IcTeR[]={"Pakisthan","India","England","Australia","South Africa",
                          "new zewland","west indians","Afghanistan","Sri Lanka","Bangladesh"};
static String iplTeamN[]={"chennai super king","royal chanllenges bangalore","Mumbai indians","Gujarat titans","Kotkath Knight riders",
                          "Rajasthan royals","sunrisers Hyderbad","delhi capitals","Lacknow super giants","Punjab Kings"};

public static void main(String crecket[]){


	System.out.println("list of Top1 Bt Man is:");
	getTop1BtM();
	System.out.println("list of Top 10IcTeR are:");
	getTop10IcTeR();
	System.out.println("list of ipl Team Names are:");
	getIplTeamN();
	
}

	public static void getTop1BtM(){
	System.out.println("inside getTop1BtM");
	for(String top1BtM1: top1BtM){
	System.out.println(top1BtM1);
	}
	}
	public static void getTop10IcTeR(){
	System.out.println("inside getTop10IcTeR");
	for(String top10IcTeRr: top10IcTeR){
	System.out.println(top10IcTeRr);
	}
	}
	public static void getIplTeamN(){
	System.out.println("inside iplTeamN");
	for(String iplTeamNo : iplTeamN){
	System.out.println(iplTeamNo);
	}
	}
}


 