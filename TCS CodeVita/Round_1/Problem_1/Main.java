import java.util.*;

class Main {
    public static int friendServed(int[] queuePreced,int index){
        int res=0;
        int queueSize=queuePreced.length;
        int temp=-1,curPos=-1;
        for(int i=0;i<queueSize;i++)
            if(temp<queuePreced[i]){
                curPos=i;
                temp=queuePreced[i];
            }
        while(curPos!=index){
            queuePreced[curPos]=-1;
            for(int i=0;i<curPos;i++)
                if(queuePreced[i]>0)
                    queuePreced[i]++;
            temp=-1;
            curPos=-1;
            for(int i=0;i<queueSize;i++)
                if(temp<queuePreced[i]){
                    curPos=i;
                    temp=queuePreced[i];
                }
            res++;
        }
        return ++res;
    }

    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=Integer.parseInt(x.nextLine());
    int[] queue=new int[n];
    for(int i=0;i<n;i++)
        queue[i]=x.nextInt();
    x.nextLine();
    int k=Integer.parseInt(x.nextLine());
    System.out.print(friendServed(queue,k-1));
    }

}
