/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static class Pair
	    {
	        static int min;
	        static int max;
	    }
	    static Pair getminmax(ArrayList list)
	    {
	        Pair pair=new Pair();
	        
	        
	        
	        Object []arr=list.toArray();
	        if(list.size()==1){
	        	pair.max=(Integer)arr[0];
	        	pair.min=(Integer)arr[0];
	        	return pair;
	        }

	        if(list.size()==2){
	        	if((Integer)arr[0]>(Integer)arr[1])
	        	{
	        		pair.max=(Integer)arr[0];
	        		pair.min=(Integer)arr[1];
	        		return pair;
	        	}
	        	else{
	        		pair.max=(Integer)arr[1];
	        		pair.min=(Integer)arr[0];
	        		return pair;
	        	}
	        }
	        pair.max=(Integer)arr[0];
	        pair.min=(Integer)arr[1];
	        for(int i=2;i<list.size();i++)
	        {
	            int num=(Integer)arr[i];
	            if(num>pair.max)
	                pair.max=num;
	            else if(num<pair.min)
	                pair.min=num;
	        }
	        return pair;
	        
	        
	    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    System.out.println("Enter the Five NUmber you want to add..press -1 to stop ");
	    while(true)
	    {
	        int item=sc.nextInt();
	        if(item==-1)
	            break;
	        list.add(item);
	    }
	    //Pair obj=new Pair();
	    Pair obj=getminmax(list);
	    
	    System.out.println("Minimum no. is "+obj.min+" max is "+obj.max);
	    
	    
	//	System.out.println("Hello World");
	}
}
