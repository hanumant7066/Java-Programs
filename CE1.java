/*
          Assignment Based On Programming

Subject Name- Advanced Java
Subject Code- CSA5301

Name-   Hanumant Godase Chhatrabhuj
Roll no- 574
class-  Msc(CA) sem 3
Microsoft team address - hanumant.godase964@deccansociety.org



Q1. Write a program to accept ‘n’ elements from the user and print all prime numbers. 
Use suitable collection which do not accept duplicate elements.   */

import java.util.*;
public class CE1
{
	static void checkprime(int num)
	{
		int cnt=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
			System.out.println(num);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of N");

		int n=sc.nextInt();

		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Enter "+n+" numbers :");

		for(int i=0;i<n;i++)
		{
			hs.add(sc.nextInt());
		}
		//System.out.println(hs);

		Iterator it=hs.iterator();
		System.out.println("primes numbers are ");

		while(it.hasNext())
		{
			int num=(Integer)it.next();
			checkprime(num);
		}
	}
}