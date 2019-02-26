package Generic;

public class DifferentValueArray <T extends Number>{
	
T ob1;



T A[];

DifferentValueArray(T o1, T O2[]){
	ob1=o1;
	A=O2;
}
	
public static void main(String...s){

Integer n[]={1,2,3,4,5};	
//DifferentValueArray<Integer> T1=new DifferentValueArray<>(50, n);
//DifferentValueArray<Integer>T2[]=new DifferentValueArray<Integer>[10];

DifferentValueArray<?> T2[]=new DifferentValueArray<?>[2];
T2[0]=new DifferentValueArray<Integer>(10,n);

System.out.println(T2[0].ob1);

Float f[]={2.3f,3.3f,4.5f,5.3f};
T2[1]=new DifferentValueArray<Float>(2.3f,f);
System.out.println(T2[1].ob1);

for(int i=0;i<T2[0].A.length;i++){
	System.out.println(T2[0].A[i]);
}

for(int i=0;i<T2[1].A.length;i++){
	System.out.println(T2[1].A[i]);
}

}

}
