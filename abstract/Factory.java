class Factory 
{
	static Area getAreaObject(String  area){

      if(area.equalsIgnoreCase("circle")){
	       return new Circle(); 
	  }

	  else if(area.equalsIgnoreCase("square")){
           return new Square();
	  }

	  else if(area.equalsIgnoreCase("triangle")){
           return new Trianle();
	  }

	  else{
	     
		 return new NoSuchAreaAvialble();
	  }
	
	  }//getAreaObject
}//class
