package Generic;

public class ClassLevel<T> {
	
T x;
T y;

ClassLevel(T x, T y){
this.x=x;
this.y=y;
}
public static void main(String...s){

ClassLevel<Integer> T1=new ClassLevel(12,12);
System.out.println(T1.x);
System.out.println(T1.y);

ClassLevel<String> T2=new ClassLevel("Saddam","QA");
System.out.println(T2.x);	
System.out.println(T2.y);	

ClassLevel<Temp> T3=new ClassLevel(new Temp(),new Temp());



}
}

class Temp{
int x=50;	
}
