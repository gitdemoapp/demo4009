package com.mycar.baleno;
import com.mycar.innova.Innova;
import com.mycar.innovafamily.*;
public class InnovaFactory 
{
	public static Innova car=null;
	public static Innova getInnovaCar(String carName){
		if(carName.equals("innovabasemodel")){
			car=new InnovaBase();
		}
		
		else{
			car=new InnovaTop();
		}

		return car;
	}
}
