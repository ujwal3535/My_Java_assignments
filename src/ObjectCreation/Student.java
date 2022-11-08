package ObjectCreation;

public class Student {
   int rollno;
   String name;
   int Percentage;
   
   void initStudent(int rollno,String name, int Percentage){
	   this.rollno=rollno;
	   this.name=name;
	   this.Percentage=Percentage;
   }
   void printDetails() {
	   System.out.println("Rollno :"+rollno+"\nName:"+name+"\nPercentage:"+Percentage+"%");
   }
}
