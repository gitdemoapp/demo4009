//defining a Patient class
class Patient
{

     //defining  non static variable (only declaration)
	 String pname;
	 int pid;
	 int pmobileNumber;
	 String emailId;
	 String address;
     //defining  static variable (only declaration)
	static  String hospitalName;
    static  int  registrationNumber;

	//defining a non static method

	void viewPatientDetails(){
	   System.out.println("patient Name "+pname);
	   System.out.println("patient id "+pid);
	   System.out.println("patient  mobile Number "+pmobileNumber);
	   System.out.println("patient email Id "+emailId);
	   System.out.println("patient address "+address);
	}

    //defining a static method

	static void viewHospitalDetails(){
      
	   System.out.println("Hospital Name :: "+hospitalName);
	   System.out.println(" Hospital registration Number :: "+registrationNumber);
	
	}

  //defining main method
	public static void main(String[] args){
	    
		//object creation | p1 is object ref variable
		Patient  p1=new Patient();

		Patient  p2=new Patient();

		p1.pname="Raja";
		p1.pid=101;
		p1.pmobileNumber=123678;
		p1.emailId="raja@gmail.com";
		p1.address="Kanpur";

		Patient.hospitalName="Kulwanti";//static variable initialization
        Patient.registrationNumber=12345;

		p1.viewHospitalDetails();//method calling

		p2.viewHospitalDetails();

		p1.viewPatientDetails();
		p2.viewPatientDetails();


	}

}


