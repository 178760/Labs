/*Create a class Student and implement array and display details of student. */


class Student 
{
  int id;         //instance variables
  String name;
  int age;
  Student(int id, String name, int age) //parameterized constructor
  {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
  
class StudentArrayDemo
{
   public static void main(String[] args) 
   {
     Student[] arr = new Student[4];
     arr[0] = new Student(210,"Nita", 20);
     arr[1] = new Student(211, "Purva", 21);
     arr[2] = new Student(212, "Gita", 20);
	 arr[3] = new Student(213, "Nikita", 21);
	 
        for (int i=0;i<arr.length;i++) 
		{
          System.out.println("ID: "+arr[i].id+"  Name: "+arr[i].name+"  Age: "+arr[i].age);
        }
    }
}