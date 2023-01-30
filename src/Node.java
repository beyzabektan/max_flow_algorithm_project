
import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{
    int height;
    int eFlow;
    List<Edge> edges;

    Node(int height, int eFlow) {
      this.height = height;
      this.eFlow = eFlow;
      edges = new ArrayList<Edge>();
    }

    void createEdge(Node end, int flow, int c) {
      edges.add(new Edge(this, end, flow, c));
      
    }

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if (this.height < o.height) {
			return 1;
		}
		
		if (this.height > o.height) {
			return -1;
		}
		
		else {
			return 0;
		}
	}

  }
