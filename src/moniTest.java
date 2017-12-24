import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class moniTest
{

	//@Test
	/*public void testPanduan()
	{
		cell [][] c=new cell[5][5];
		int i,j,sm;
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

	}*/

	@Test
	public void testZhuanhuan()
	{
		 assertEquals(0,new moni().zhuanhuan()[0][1]);
	}

}
