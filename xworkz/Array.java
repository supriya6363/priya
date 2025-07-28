class Array {

public static void main(String[] args){
int[] employeeids = new int[5];
System.out.println(employeeids);
for(int i=0;i<employeeids.length;i++){
System.out.println([i]);
}
employeeids[0] = 1;
System.out.println(employeeids[0]);
System.out.println(employeeids[1]);
for(int i=0; i<employeeids.length;i++){
employeeids[i] = i+10;
}

for(int i=0; i<employeeids.length;i++){
System.out.println(employeeids[i]);
}
