package Generic;

public class GenericFunctionLevel {
	
public int val;

<T extends Number>GenericFunctionLevel(T arg){
System.out.println("Value of arg "+arg);
val=arg.intValue();
}

void showVal(){
System.out.println("Value of Val is "+val);	

}


public static void main(String...s){

GenericFunctionLevel T1=new GenericFunctionLevel(100);
GenericFunctionLevel T2=new GenericFunctionLevel(2.4f);
//GenericFunctionLevel T3=new GenericFunctionLevel("Saddam");

T1.showVal();
T2.showVal();
//T3.showVal();
	
}


}
