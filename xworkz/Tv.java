class Tv {

String name;
int size;
double price;
boolean smart;
String color;


public Tv (){
}

public static void main(String[] args){

Tv tv = new Tv();
tv.name = "Samsung";
System.out.println("Tv Name is : " + tv.name);

Tv  tv1 = new Tv();
tv1.size = 32;
System.out.println("Tv Size is :" + tv1.size);

Tv tv2 =new Tv();
tv2.price = 2000.2;
System.out.println("Tv Price is : " +tv2.price);

Tv tv3 = new Tv();
tv3.smart = true;
System.out.println("The TV is smart : " + tv3.smart);

Tv tv4 = new Tv();
tv4.color= "silver";
System.out.println("Tv color is :" + tv4.color);

Tv tv5 = new Tv();
tv5.name = "readme";
System.out.println("Tv Name is : " + tv5.name);

Tv tv6 = new Tv();
tv6.size = 30;
System.out.println("TV Size is : " + tv6.size);

Tv tv7 = new Tv();
tv7 .price = 4000;
System.out.println("Tv Price is : " +tv7.price);

Tv tv8 = new Tv();
tv8.smart = true;
System.out.println("The TV is smart : " + tv8.smart);

Tv tv9 = new Tv();
tv9.color= "silver";
System.out.println("Tv color is :" + tv9.color);






tv.setName("LG");
System.out.println("Tv Name is : " + tv.name);

tv1.setSize(34);
System.out.println("Tv Size is :" +tv1.size);

tv2.setPrice (2000.45);
System.out.println("Tv Price is: " + tv2.price);

tv3.setSmart(true);
System.out.println("the tv is smart :" + tv3.smart);

tv4.setColor("Block");
System.out.println("Tv color is: " + tv4.color);

tv5.setName1("LG");
System.out.println("Tv Name is : " + tv5.name);

tv6.setSize1(34);
System.out.println("Tv Size is :" +tv6.size);

tv7.setPrice1(2000.45);
System.out.println("Tv Price is: " + tv7.price);

tv8.setSmart1(true);
System.out.println("the tv is smart :" + tv8.smart);

tv9.setColor1("Block");
System.out.println("Tv color is: " + tv9.color);



}

public void setName(String tvName){
name = tvName;

}

public void setSize(int tvSize){
size = tvSize;
}

public void setPrice(double tvPrice){
price= tvPrice;
}

public void setSmart(boolean tvSmart){
smart = tvSmart;
}

public void setColor(String tvColor){
color = tvColor;
}

public void setName1(String tvName){
name = tvName;

}

public void setSize1(int tvSize){
size = tvSize;
}

public void setPrice1(double tvPrice){
price= tvPrice;
}

public void setSmart1(boolean tvSmart){
smart = tvSmart;
}

public void setColor1(String tvColor){
color = tvColor;
}

}

