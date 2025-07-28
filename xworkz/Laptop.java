class Laptop {


String name;
float price;
int storage;
String  future;

public laptop() {

}

public static void main(String [] args){

laptop laptop = new laptop();
laptop.name = "asus";
System.out.println(laptop.name);
laptop.setname("hp");
System.out.println(laptop.name);



laptop laptop1 = new laptop();
laptop1.name = "dell";
laptop1.setname("dell");
System.out.println(laptop1.name);
System.out.println(laptop.name);
}

public String setname(String laptopname) {
new = laptopname;
}
}




