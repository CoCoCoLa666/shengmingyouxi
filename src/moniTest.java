import static org.junit.Assert.*;

import org.junit.Test;

public class moniTest
{

	@Test
	public void testZhuanhuan()
	{
		moni mo=new moni();
		assertEquals(0,(mo.randomcell().zhuanhuan()[0][1]).getSm());
	}

}
