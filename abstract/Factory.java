class Factory 
{
	static Area getAreaObject(String  area){

      if(area.equals("circle")){
	       return new Circle(); 
	  }

	  else if(area.equals("square")){
           return new Square();
	  }

	  else if(area.equals("triangle")){
           return new Trianle();
	  }

	  else{
	     
		 return null;
	  }
	
	  }//getAreaObject
}//class
