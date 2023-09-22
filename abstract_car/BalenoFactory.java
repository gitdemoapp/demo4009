package com.mycar.baleno;
import com.mycar.baleno.Baleno;
import com.mycar.balenofamily.*;
public class BalenoFactory 
{
	public static Baleno car=null;
	public static Baleno getBalenoCar(String carName){
		if(carName.equals("balenobasemodel")){
			car=new BalenoBase();
		}
		else if(carName.equals("balenozetamodel")){
			car=new BalenoZeta();
		}
		else{
			car=new BalenoTop();
		}

		return car;
	}
}
