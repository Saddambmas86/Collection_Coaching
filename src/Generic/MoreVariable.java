package Generic;

public class MoreVariable <T>{
	
T x;	
MoreVariable(T o1){
x=o1;	
}

T getx(){
	return x;
}

void show(){
System.out.println("Type of T is "+x.getClass().getName());
}

public static void main(String...s){
MoreVariable<Integer> T1=new MoreVariable<>(98);
T1.show();
int V=T1.getx();
System.out.println("Value "+V);


MoreVariable<String> T2=new MoreVariable<>("Saddam");
T2.show();
String V1=T2.getx();
System.out.println("Value "+V1);

Temp T3=new Temp();
MoreVariable<Temp> T4=new MoreVariable<>(T3);
T4.show();
Temp T5=T4.x;
System.out.println("Value "+T5);

System.out.println("T1 "+T1);
System.out.println("T2 "+T2);




}

}
