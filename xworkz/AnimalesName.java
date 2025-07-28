class  AnimalesName {

private String name;
private int age;
private String color;

public AnimalesName() {
System.out.println("No argument constructor/ defult constructor");
this.name = "Dog";
this.age = 10;
this.color = "Black";
}
public AnimalesName(String name) {
System.out.println("parameterized constructor");
this.name = name;
}
public AnimalesName(int age) {
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

