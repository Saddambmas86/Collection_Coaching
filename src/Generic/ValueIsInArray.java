package Generic;

public class ValueIsInArray {

public<T,V extends T> boolean IsIn(T x, V[] y){

	for(int i=0;i<y.length;i++){
	if(x.equals(y[i])){
		return true;
	}
	}
	return false;
}


public static void main(String...s){

Integer A[]={1,2,4,5,6,7,8};	

ValueIsInArray T1=new ValueIsInArray();

if(T1.IsIn(2, A)){
	System.out.println("2 is A[] Array");
}

String B[]={"QA","Test","Selenium", "QTP"};
ValueIsInArray T2=new ValueIsInArray();
if(T2.IsIn("Test", B)){
	System.out.println("Value is in B[]");
}


}
	
}
