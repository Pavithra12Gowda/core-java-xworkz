class SmartMarket{

public static void main(String smart[])
{
	 String vegitable[]={"Potato","onion","ladyfinger","tamota","carrate","brinjal","beans","cabbage","calliflower","drumstic"};
	String biscuits[]={"goodday","marrigold","50-50","20-20","milky","creamy","marle","parle-G","burbon","milkybites"};
	String perfume[]={"signature","fog","densor","nivia","vanilla perfume","best robost","chanel chance"};
	String gloceries[]={"pasta","rice","meat","bread","chees","sauces","eggs","eggssuper"};
	String consmetic[]={"cream","powder","nilepallish","poundetion","face primer","blush",
                          "Eyebrow pencil","Eye Primer","face powder","dior","silicon based","oil removal jel","moisturizer","lipstik","lip balm","nail.filter","eye kajal","compact","eyeshado","cleanser","lip gloss","lotion","sponge","hand cream"};

	
	System.out.println("=====");
	System.out.println("list of vegitable are:");
	fetchVegitable(vegitable);
	System.out.println("list of biscuits are:");
	getBiscuits(biscuits);
	System.out.println("list of perfume are:");
	getPerfume(perfume);
	System.out.println("list of gloceries are:");
	getGloceries(gloceries);
	System.out.println("list of consmetics are:");
	getConsmetic(consmetic);
	System.out.println("main ended");

}

//for
	public static void fetchVegitable(String vegitable[]){
	System.out.println("inside vegitable");
	for(String vegitableLa:vegitable){
	System.out.println(vegitableLa);
	}
	}
	//read-get,fetch,read
	public static void getBiscuits(String biscuits[]){
	System.out.println("inside biscuits");
	for(String biscuit:biscuits){
	System.out.println(biscuit);
	}
	}
	public static void getPerfume(String perfume[]){
	System.out.println("inside perfume");
	for(String perfum : perfume){
	System.out.println(perfum);
	}
	}
	public static void getGloceries(String gloceries[]){
	System.out.println("inside gloceries");
	for(String glocerie : gloceries){
	System.out.println(glocerie);
	}
	}
	public static void getConsmetic(String consmetic[]){
	System.out.println("inside consmetics");
	for(String consmetics : consmetic){
	System.out.println(consmetics);
	}
	}
}
