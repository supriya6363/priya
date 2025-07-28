class Tiger {

private String name;
private int age;
private String color;

public Tiger() {
System.out.println("No argument constructor/ defult constructor");
this.name = "machalli";
this.age = 10;
this.color = "orange";
}
public Tiger(String name) {
System.out.println("parameterized constructor");
this.name = name;
}
public Tiger(int age) {
System.out.println("parameterized constructor");
this.age = age;
}

public void setName(String Name){
name = name;
}
public void setAge(int  Age){
age = age;
}
public void setColor(String color){
color = color;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
public String getColor(){
return color;
}
}

