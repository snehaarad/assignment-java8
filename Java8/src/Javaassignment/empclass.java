package Javaassignment;

//10th program
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class employee
{
String name;
int id;
public employee(String name, int id) {
this.name = name;
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
}
public class empclass { public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<employee> I=new ArrayList<employee>();
I.add(new employee("sneha",1));
I.add(new employee("neha",2));
I.add(new employee("mansi",3));
Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
System.out.println(empMap);
Set<String> nameSet = I.stream().map(e->e.name).collect(Collectors.toSet());
System.out.println(nameSet);
}}


