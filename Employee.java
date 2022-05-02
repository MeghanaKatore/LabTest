package SerializableExample;
import java.io.*;

public class Employee implements Serializable 
{
String name;
int age;

Employee(String name,int age)
{
this.name= name;
this.age=age;
}

void display()
{  System.out.println(name + age);  }
}
 