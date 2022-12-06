class Radio 
{

	 float  radioStationNumber;

	 String radioStationName;

	float tune(){
	     return   radioStationNumber;
	}

	void playSong(String songName,String movieName){

		float  a= tune();
	    System.out.println("playing "+songName+ " song from movie "+ movieName+" on your demand from "+radioStationName +" kanpur "+a);
	
	}


	public static void main(String[] args) 
	{
		

		java.util.Scanner  s1=new java.util.Scanner(System.in);

		System.out.println("plz enter radio station number ");
         
		Radio r1=new Radio();

		r1.radioStationNumber= s1.nextFloat();

		System.out.println("plz enter radio station name");
         
		r1.radioStationName= s1.next();

        
		r1.playSong("see u again","fast and furious-7");
	}
}
