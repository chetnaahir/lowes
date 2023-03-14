
public class marks {
    public static void main(String[] args) {
    	int sid= 101;
        String sname= "Riya";
    	int n=3, totalmarks=0;
    	float perc;
    	int m[]= { 55, 78, 90};
    	System.out.println("Student id :"+sid);
    	System.out.println("Student name :"+sname);
    	for(int i=0; i<n;i++) {
    		totalmarks+= m[i];
    	}
    	System.out.println("Total Marks : "+ totalmarks);
    	
    	perc= (totalmarks / (float)n);
    	System.out.println("Average Marks: "+perc+"%");
    	
    	int c_held=280;
    	int c_att= 140;
    	System.out.println("Attendance percentage:"+ ((c_att*100)/c_held)+"%");
    	
    }
	   
}