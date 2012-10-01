import java.awt.Point;
import java.util.ArrayList;


public class Cluster
{
	private int nPoint;
	protected final ArrayList<Point> ptArray; 
	
	public Cluster()
	{
		nPoint = 0;
		ptArray = new ArrayList<Point>();
	}
	public void addpoint(Point pt)
	{
		ptArray.add(pt);
		nPoint++;
	}
	
	public boolean isAdjacent(Point pt)
	{
		for(int i =0; i<this.nPoint; i++)
		{	
			Point po = ptArray.get(i);
			if(po.distance(pt)<=1.0)
				return true;
			else
				continue;
		}
		return false;
	}
	
	public int getNPoint()
	{
		return this.nPoint;
	}
	
	//
	public Cluster mergeCluster(Cluster anotherCluster)
	{
		
		return this;
	}
	
}

