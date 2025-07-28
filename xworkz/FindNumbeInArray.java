class FindNumberInArray {
public static void main(String[] args){
int array[] = {10,30,40,50,20,90};
//int [] a;
//int b[];
for(int i=0;i<array.length;i++){
System.out.println(array[i]);
}
int number = 90;
for(int i=0;i<array.length;i++){
if(array[i] == number){
System.out.println("element found " + number + "at index"+i);
}
}
}
}
