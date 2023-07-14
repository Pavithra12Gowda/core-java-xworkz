class NetFlix2{

							
public static void main(String prime[]){

	 String kannadaM[]={"kutumba","kabzza","kotoraveera surasundaranga jana","upii2","buddivanta","topival","upendra","kalpana","i love u","mukunda murari",
                            "googli", "ramachari","veera","veera madakari","rajakumara","rajadhani","veera kannadiga","KGF","milana","moggina manasu",
							"santu starite forward","gajakesari","gaja" ,"natasarvabowma","aras","basava"};
	String hindiM[]={"Pathaan","kgf1","kgf2 ","jabariya jodi","brediya","bholaa","shehzada","brahmastra","mission manju","vikram vedha",
                            "2.0", "tanhaji","mohenjo daro","jaan","selfiee","sanju","war","sultan","kabir sing","dhoom3",
							"drishyam2","the kerala story","kick" ,"krrish3","3idiots"};	

	String teluguM[]={"Sankarabharnsm","bommarullu","geethanjali","manam","shiva","manmadhudu","arya","okkadu","indra","tholiprema",
                            "dollor dreams", "malliswari","baahubali","baahubali 2","drushyam","rajadhani","tagore","magadharu","eega","moggina manasu",
							"spokira","arundhathi","rajanna" ,"mahsnati","vedam","simhadri"};

	String malayalamM[]={"2018","the great indian kitchen","salute","pada","hridayam","drishyam","kaalapani","the ornate lock","devasuram","unda",
                            "iratta", "aathmakatha","munnariyippu","bahubali2","romacham","jo and jo","jallikattu","premam","indian rupee","bangalore days",
							"the address","gpathemari","artist" ,"joji","koode","virus"};
	
	String englishM[]={"sisu","the exorcist","evildead rise","inception","buddivanta","americon beauty","the prestige","the dark knight","the godfather part2","12 angry men",
                            "pulp fiction", "the good ,the birld and the ugle","veera","forrest gump","fight club","inceptioni","the matrix","rajani","goodfellas","se7en",
							"city of god","interstellar","parasity" ,"natasarvabowma","the pianist","back of the future"};
							

	System.out.println("list of Kannada movies are:");
	fetchKannadaM(kannadaM);
	System.out.println("list of Hindi movies are:");
	getHindiM(hindiM);
	System.out.println("list of Telugu movies are:");
	getTeluguM(teluguM);
	System.out.println("list of Malayalam movies are:");
	getMalayalamM(malayalamM);
	System.out.println("list of English movies are:");
	getEnglishM(englishM);
	System.out.println("main ended");
	
}

	public static void fetchKannadaM(String kannadaM[]){
	System.out.println("inside fetchKannada movies");
	for(String kannada : kannadaM){
	System.out.println(kannada);
	}
	}
	public static void getHindiM(String hindiM[]){
	System.out.println("inside get hindimovies");
	for(String hindi : hindiM){
	System.out.println(hindi);
	}
	}
	public static void getTeluguM(String teluguM[]){
	System.out.println("inside get telugu movies");
	for(String telugu : teluguM){
	System.out.println(telugu);
	}
	}
	public static void getMalayalamM(String malayalamMSt[]){
	System.out.println("inside malayalam movies");
	for(String malayalam : malayalamM){
	System.out.println(malayalam);
	}
	}
	public static void getEnglishM(String englishM){
	System.out.println("inside english movies");
	for(String english : englishM){
	System.out.println(english);
	}

}
}