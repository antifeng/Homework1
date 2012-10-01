
import java.awt.Point;
import java.util.ArrayList;

public class Board {

	/**
	 * @param args
	 */
	protected final ArrayList<Point> ptArray;
	protected final ArrayList<Cluster> ClusterArray;
	private int nRow, nColumn;
	
	public Board(int nRow, int nColumn, Point[] ptList)
	{
		this.nRow = nRow;
		this.nColumn = nColumn;
		
		ClusterArray = new ArrayList<Cluster>();
		ptArray = new ArrayList<Point>();
		
		int nlen = ptList.length;
		for(int i=0; i<nlen; i++)
			ptArray.add(ptList[i]);
		
	}
	
	public boolean doCluster()
	{

		Cluster RowCluster = new Cluster();
		RowCluster.addpoint(ptArray.get(0));
		ClusterArray.add(RowCluster);
		
		int nCluster = 1;
		for(int i=1; i< ptArray.size(); i++)
		{
			Point pt = ptArray.get(i);
			boolean IsMerged = false;
			for(int j=0; j<nCluster; j++)
			{
				Cluster CurCluster = ClusterArray.get(pt.x);
				if (CurCluster.isAdjacent(pt))
					{
						CurCluster.addpoint(pt);
						IsMerged = true;
						break;
					}
				else
					continue;
			}
			if (!IsMerged)
			{
				Cluster ObjCluster = new Cluster();
				this.ClusterArray.add(ObjCluster);
				nCluster++;
			}
		}
				
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
