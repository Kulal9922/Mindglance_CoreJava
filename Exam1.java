import java.io.*;
 class Employee implements Serializable
   {
     public int id;
     public String name;
   }
     public class serializationClass
      {
     public static void main(String args[])throws Exception
      {
      Employee emp = new Employee();  //creat obj
      emp.id = 10;
     emp.name= "Kishor";
     FileOutputStream fileOut = new FileOutputStream("KK.txt"); //file creat
     ObjectOutputStream Out = new ObjectOutputStream(fileOut); //output of file
  
 Out.writeObject(emp);
 Out.close();
 fileOut.close();
 System.out.println("Data saved");
}
}
