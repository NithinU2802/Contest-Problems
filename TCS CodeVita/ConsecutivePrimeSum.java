/******************************************************************************

Question – :  Some prime numbers can be expressed as a sum of other consecutive prime numbers.

For example
5 = 2 + 3,
17 = 2 + 3 + 5 + 7,
41 = 2 + 3 + 5 + 7 + 11 + 13.

-Your task is to find out how many prime numbers which satisfy this property are 
present in the range 3 to N subject to a constraint that summation should always 
start with number 2.
-Write code to find out the number of prime numbers that satisfy the above-mentioned 
property in a given range.

Input Format: First line contains a number N

Output Format: Print the total number of all such prime numbers which are less than or equal to N.

Constraints: 2<N<=12,000,000,000


Input: 20
Output: 2 

Input: 10
Output: 1 

Input: 50
Output: 3 


Solution: 
    we need to identify the prime numbers within the range as given the print the 
count of prime numbers that their sum is an prime number(within given input) ...!


*******************************************************************************/

import java.util.*;

public class ConsecutivePrimeSum
{
    public static boolean isprime(long a){
        for(long i=2;i<=a/2;i++)
        if(a%i==0) return false;
        return true;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	long n=x.nextLong(),f=0;
	long s=0,res=-1;
	for(long i=2;i<=n;i++){ 
	    f=0;
	    for(long j=2;j<=i/2;j++){
	        if(i%j==0){ f=1; break; }
	    }
	    if(f==0){
	        s+=i;
	        if(s>n) break;
	        if(isprime(s))
	            res++;
	    }
	}
	System.out.println(res);
	}
}
