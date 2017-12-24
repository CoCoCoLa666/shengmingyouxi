import java.util.Random;

public class moni
{
	    private int num=5;
	    private cell [][] c=new cell[num][num];
	    
	    public void panduan()
	    {
	        int i,j;
	        for(i=0;i<num;i++)
	        {
	            for(j=0;j<num;j++)
	            {
	                int l=0,d=0;
	                if(0<=i-1&&0<=j-1){
	                if(c[i-1][j-1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i-1][j-1].getSm()==0)
	                {
	                    d++;
	                }}
	                if(0<=i-1){
	                if(c[i-1][j].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i-1][j].getSm()==0)
	                {
	                    d++;
	                }}
	                if(0<=i-1&&j+1<num){
	                if(c[i-1][j+1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i-1][j+1].getSm()==0)
	                {
	                    d++;
	                }}
	                if(0<=j-1){
	                if(c[i][j-1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i][j-1].getSm()==0)
	                {
	                    d++;
	                }}
	                if(j+1<num){
	                if(c[i][j+1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i][j+1].getSm()==0)
	                {
	                    d++;
	                }}
	                if(i+1<num&&0<=j-1){
	                if(c[i+1][j-1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i+1][j-1].getSm()==1)
	                {
	                    d++;
	                }}
	                if(i+1<num){
	                if(c[i+1][j].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i+1][j].getSm()==1)
	                {
	                    d++;
	                }}
	                if(i+1<num&&j+1<num){
	                if(c[i+1][j+1].getSm()==1)
	                {
	                    l++;
	                }
	                if(c[i+1][j+1].getSm()==1)
	                {
	                    d++;
	                }}
	                c[i][j].setLive(l);
	                c[i][j].setDeath(d);
	            }
	        }
	    }
	    public void randomcell()
	    {
	        int i,j,sm;
	        /*for(i=0;i<num;i++)
	        {
	            for(j=0;j<num;j++)
	            {
	                c[i][j]=new cell();
	                Random r=new Random();
	                sm=r.nextInt(2);
	                c[i][j].setSm(sm);
	                c[i][j].setLive(0);
	                c[i][j].setDeath(0);
	            }
	        }*/
	        for(i=0;i<5;i++)
	        {
	            for(j=0;j<5;j++)
	            {
	                c[i][j]=new cell();
	                c[i][j].setLive(0);
	                c[i][j].setDeath(0);
	            }

	        }
	        c[0][0].setSm(0);
	        c[0][1].setSm(1);
	        c[0][2].setSm(1);
	        c[0][3].setSm(1);
	        c[0][4].setSm(0);
	        c[1][0].setSm(0);
	        c[1][1].setSm(1);
	        c[1][2].setSm(1);
	        c[1][3].setSm(1);
	        c[1][4].setSm(1);
	        c[2][0].setSm(0);
	        c[2][1].setSm(1);
	        c[2][2].setSm(1);
	        c[2][3].setSm(0);
	        c[2][4].setSm(0);
	        c[3][0].setSm(1);
	        c[3][1].setSm(0);
	        c[3][2].setSm(1);
	        c[3][3].setSm(0);
	        c[3][4].setSm(0);
	        c[4][0].setSm(0);
	        c[4][1].setSm(0);
	        c[4][2].setSm(1);
	        c[4][3].setSm(1);
	        c[4][4].setSm(0);
	    }
	    public void dayin()
	    {
	        int i,j;
	        for(i=0;i<num;i++)
	        {
	            for(j=0;j<num;j++)
	            {
	                System.out.print(c[i][j].getSm());
	                System.out.print(" ");
	            }
	            System.out.print("\n");
	        }
	        System.out.print("-------------------------------------------------------------------------------------------------------------------------------\n");
	    }
	    public cell[][] zhuanhuan()
	    {
	        int i,j;
	        for(i=0;i<num;i++)
	        {
	            for(j=0;j<num;j++)
	            {
	                if(c[i][j].getSm()==1) {
	                    if (c[i][j].getLive() < 2) {
	                        c[i][j].setSm(0);
	                        continue;
	                    }
	                    if (c[i][j].getLive() == 2 || c[i][j].getLive() == 3) {
	                        continue;
	                    }
	                    if(c[i][j].getLive()>3) {
	                        c[i][j].setSm(0);
	                        continue;
	                    }
	                }
	                if(c[i][j].getSm()==0)
	                {
	                    if(c[i][j].getLive()>=3)
	                    {
	                        c[i][j].setSm(1);
	                    }
	                }
	            }
	        }
	        return c;
	    }
	    public  static void  main(String[] args)
	    {
	        moni t=new moni();
	        t.randomcell();
	        t.dayin();
	        for(int i=0;i<5;i++)
	        {
	            t.panduan();
	            t.zhuanhuan();
	            t.dayin();
	        }
	    }
	

}
