package Generic;

public class BoundGenericType<T extends Number> {

	
T[] nums;
BoundGenericType(T[] o1){
nums=o1;	
}

double average(){
	double sum=0.0;
	for(int i=0;i<nums.length;i++){
		sum=sum+nums[i].doubleValue();
	}
return sum;
}
public static void main(String...s){

Integer inums[]={1,2,3,4,5};	
BoundGenericType<Integer>T1=new BoundGenericType<>(inums);
double V= T1.average();
System.out.println("T1 average is "+V);

Double dnums[]={1.0,2.0,3.3,4.4,5.5};
BoundGenericType<Double>T2=new BoundGenericType<>(dnums);
double V1= T2.average();
System.out.println("T1 average is "+V1);


//Show compile error for below:
String Snums[]={"QA","QA2"};
//BoundGenericType<String>T3=new BoundGenericType<>(Snums);







}


}
