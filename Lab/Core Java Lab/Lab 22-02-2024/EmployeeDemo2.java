class Employee
{
  String name;               //Attributes
  int employeeId ;
  String designation;
  double salary;
  
   public Employee(String name,int employeeId ,String designation,double salary)         //parameterized constructor
   {
   this.name=name;
   this.employeeId=employeeId;
   this.designation=designation;
   this.salary=salary;
   }
   
   public void calculateBonus()
   {
	double bonus= 0.05 * salary;
	System.out.println("Bonus= "+bonus);

       
   }
 
}

class EmployeeDemo2
{
  public static void main(String args[])                             //main method
  {
    Employee e1=new Employee("Nita",233,"Software Engineer",5000);   //calling new object
	e1.calculateBonus();
	
  }
}