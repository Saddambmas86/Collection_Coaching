package Generic;

public class TwoVariable<T,V> {

T ob1;
V ob2;

TwoVariable(T o1, V o2){
ob1=o1;
ob2=o2;
}


void show(){
System.out.println("Type of T is "+ob1.getClass());	
System.out.println("Type of V is "+ob2.getClass());
}

public static void main(String...s){
TwoVariable<Integer, String> T1=new TwoVariable<>(1,"Saddam");
T1.show();
int T=T1.ob1;
String V=T1.ob2;
System.out.println("Value of T is "+T);
System.out.println("Value of V is "+V);	
System.out.println();

TwoVariable<String, String> T2=new TwoVariable<>("QA","Saddam");
T2.show();
String T12=T2.ob1;
String V1=T2.ob2;
System.out.println("Value of T12 is "+T12);
System.out.println("Value of V1 is "+V1);

}


	
}
