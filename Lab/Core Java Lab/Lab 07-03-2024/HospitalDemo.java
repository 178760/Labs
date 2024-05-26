/* 2. Create a program in java to implement multilevel inheritance and hierarchical Inheritance Take classes like: Doctor, Surgeon and Nurse 
 Create methods and show method overriding.*/
 
 

class Doctor               //parent class name
{
    void checkPatient()    //method
	{
      System.out.println("Doctor is checking patient");
    }
}

class Surgeon extends Doctor      //child class name Surgeon inherited from Doctor
{
    
    void checkPatient()           //overrides the checkPatient method inherited from Doctor
	{
       System.out.println("Surgeon is doing surgery");
    }
    
    void performOperation()       //method
	{
        System.out.println("Surgeon is doing an operation");
    }
}

class Nurse extends Doctor        //child class name Nurse inherited from Doctor
{
    void checkPatient()           //overrides the checkPatient method inherited from Doctor
	{
        System.out.println("Nurse is supporting in patient care");
    }
    
    void patientCare()           //method
	{

        System.out.println("Nurse is taking care of the patient");
    }
}
class HospitalDemo 
{
    public static void main(String[] args)   //main method
	{
		Doctor d1 = new Doctor(); //created a new object of Doctor
		d1.checkPatient();        //calling method
		
        Surgeon s1 = new Surgeon();  //created a new object of Surgeon
        s1.checkPatient();            //calling method
        s1.performOperation(); 
        
		Nurse n1 = new Nurse(); //created a neu object of Nurse
        n1.checkPatient();   //calling method
        n1.patientCare(); 
    }
}
