/*
 * 
 * Two girls playing ball game with green, yellow and red balls. Our
 * task is to give output as possible outcome based on arrangement
 * without repeating same colour as sequence 
 * 
 * TestCase 1:
 * 1 1 1
 * 
 * Output:
 * 6
 * 
 * TestCase 2:
 * 1 1 0
 * 
 * Output:
 * 2
 * 
 */

import java.util.*;

class BallGame{

    static Set<String> res;

    public static void chances(int green,int yellow,int red,char a,String r){
        if(green==0 && yellow==0 && red==0){
            res.add(r);
            return;
        }
        if(a=='-'){
            chances(green-1,yellow,red,'g',r+'g');
            chances(green,yellow-1,red,'y',r+'y');
            chances(green,yellow,red-1,'r',r+'r');
        }else if(a=='g'){
            if(yellow>0)
                chances(green,yellow-1,red,'y',r+'y');
            if(red>0)
                chances(green,yellow,red-1,'r',r+'r');
        }else if(a=='y'){
            if(green>0)
                chances(green-1,yellow,red,'g',r+'g');
            if(red>0)
                chances(green,yellow,red-1,'r',r+'r');
        }else if(a=='r'){ 
            if(green>0)
                chances(green-1,yellow,red,'g',r+'g');
            if(yellow>0)
                chances(green,yellow-1,red,'y',r+'y');
        }
    }
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);
        int green=x.nextInt(),yellow=x.nextInt(),red=x.nextInt();
        res=new HashSet<>();
        chances(green,yellow,red,'-',"");
        System.out.println(res.size());
    }
}
