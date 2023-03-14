
public class Controlst {
public static void main(String[] args) {
	//if statement
	int x=3;
	int y=1;
	if (x>y) {
		System.out.println("x is greater");
	}
	else {
		System.out.println("y is greater");
	}
	//if else if statement
	String fruit = "orange";  
	if(fruit == "mango") {  
	System.out.println("fruit is mango");  
	}
	else if (fruit == "kiwi") {  
	System.out.println("fruit is kiwi");  
	}  
	else {  
	System.out.println(fruit);  
	} 
	//switch statement
	int nm = 0;  
	switch (nm){  
	case 0:  
	      System.out.println("number is 0");  
	      break;  
	case 1:  
	      System.out.println("number is 1");  
	      break;  
	      default:  
	System.out.println(nm);  
	} 
	
	//for loop
	int sum = 0;  
	for(int i = 1; i<=10; i++) {  
	sum = sum + i;  
	}  
	System.out.println("The sum of numbers are " + sum);  
	
	//while loop
	int i = 1;    
	System.out.println("Printing the list of first 10 odd numbers \n");    
	while(i<=10) {    
	System.out.println(i);    
	i = i + 2;    
	}
	
	//do while loop
	int j = 0;    
	System.out.println("Printing the list of first 10 even numbers \n");    
	do {    
	System.out.println(j);    
	j = j + 2;    
	}while(j<=10);  
}
}
