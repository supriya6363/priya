class Book {

String name;
int size;
double price;
boolean smart;
String color;
  
static long length;


 Book (){
}

public static void main(String[] args){

Book book = new Book();
book.name = "classment";
System.out.println("Book Name is : " + book.name);

Book  book1 = new Book();
book1.size = 10;
System.out.println("Book Size is :" + book1.size);

Book book2 =new Book();
book2.price = 152.2;
System.out.println("Book Price is : " +book2.price);

Book book3 = new Book();
book3.smart = true;
System.out.println("The Book is Smart : " + book3.smart);

Book book4 = new Book();
book4.color= "blue";
System.out.println("Book color is :" + book4.color);

book.setName("achiver");
System.out.println("Book Name is : " + book.name);

book1.setSize(5);
System.out.println("Book Size is :" +book1.size);

book2.setPrice (120.5);
System.out.println("Book Price is: " + book2.price);

book3.setSmart(true);
System.out.println("the Book is Smart :" + book3.smart);

book4.setColor("red");
System.out.println("Book Color is: " + book4.color);

}

public void setName(String bookName){
name = bookName;

}

public void setSize(int bookSize){
size = bookSize;
}

public void setPrice(double bookPrice){
price= bookPrice;
}

public void setSmart(boolean bookSmart){
smart = bookSmart;
}

public void setColor(String bookColor){
color = bookColor;
}
public String getName() {
return name;
}

public int getSize() {
return size;
}

public double getPrice(){
return price;
}
public boolean getSmart(){
return smart;
}
public String getColor(){
return color;
}



public String Bookdetailes(){
return "Book details " + name + "price " + price+ "size" + size+"smart"+smart+ "color" + color;
}
}



