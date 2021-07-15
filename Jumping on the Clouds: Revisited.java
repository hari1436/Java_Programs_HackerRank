static int jumpingOnClouds(int[] c, int k) {
      int e=100;
      int l=c.length;
      int start=0;
      for(int i=start;start<l;)
      {   start=(start+k)%l;
          if(c[start]==1)
           {
               e=e-3;
           }
           else
           {
               e--;
           }
          if(start==0)
           return e;
      }
      
     return 100;

    }
