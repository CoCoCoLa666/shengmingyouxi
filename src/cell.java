
public class cell
{
	 private int sm;
	    private int live;
	    private int death;
	    public cell(){}
		public cell(int sm, int live, int death)
		{
			super();
			this.sm = sm;
			this.live = live;
			this.death = death;
		}
		public int getSm()
		{
			return sm;
		}
		public void setSm(int sm)
		{
			this.sm = sm;
		}
		public int getLive()
		{
			return live;
		}
		public void setLive(int live)
		{
			this.live = live;
		}
		public int getDeath()
		{
			return death;
		}
		public void setDeath(int death)
		{
			this.death = death;
		}
	    
}
