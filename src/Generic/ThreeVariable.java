package Generic;

public class ThreeVariable<V1,V2,V3>{

V1 obj1;
V2 obj2;
V3 obj3;

ThreeVariable(V1 o1, V2 o2, V3 o3){
obj1=o1;
obj2=o2;
obj3=o3;
}

void show(){
System.out.println("Type of V1 is "+obj1.getClass());	
System.out.println("Type of V2 is "+obj2.getClass());
System.out.println("Type of V3 is "+obj3.getClass());
}

public static void main(String...s){
ThreeVariable<Integer, Double, Float>T1=new ThreeVariable<>(1,23.0,2.4f);
T1.show();
int Value1=T1.obj1;
double Value2=T1.obj2;
float Value3=T1.obj3;
System.out.println("Value of obj1 is "+Value1);
System.out.println("Value of obj2 is "+Value2);
System.out.println("Value of obj3 is "+Value3);
}


}
