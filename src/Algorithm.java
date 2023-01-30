
import java.util.List;
import java.util.ArrayList;

public class Algorithm {

  List<Node> allnodes;

  public Algorithm(int nodeCount) {
    allnodes = new ArrayList<>();

    // initialize nodes
    for (int i = 0; i < nodeCount; i++) {
    	allnodes.add(new Node(0, 0));
    }
    
    allnodes.get(0).height = nodeCount;
  }
  
  

  // create edges
  public void createEdge(int startingID, int endingID, int c) {
	  Node starting = allnodes.get(startingID);
	  Node ending = allnodes.get(endingID);
	  starting.createEdge(ending, 0, c);
  }

  
  public int endingFlow(ArrayList<Vehicle> liste) {
	  
	  Node source = allnodes.get(0);

	    for (int i =0; i < source.edges.size(); i ++) {
	      Edge myedge = source.edges.get(i);
	      myedge.flow = myedge.capacity;
	      myedge.end.eFlow += myedge.flow;
	      myedge.end.createEdge(source, -myedge.flow, 0);
	    }
	    
    // push or relabel while there are active nodes
    Node thisNode = activeNode();
    while (thisNode != null) {
    
      if (forward(thisNode) == false) {
    	  int minheight = Integer.MAX_VALUE;
    	    for (Edge e : thisNode.edges) {
    	      if ((e.flow < e.capacity) && (e.end.height < minheight)) {
    	    	  minheight = e.end.height;
    	        thisNode.height = minheight + 1;
    	      }
    	    }
      }
      thisNode = activeNode();
      int ctrl = 0;
      for (Vehicle l : liste) {
    	  if (allnodes.get(l.id).height > 1) {
    		  ctrl += 1;
    	  }
      }

      if (ctrl == liste.size()) {
    	  break;
      }
    }
    

    return allnodes.get(allnodes.size()-1).eFlow;
    
    
  }


  public boolean forward(Node n) {
    for (Edge e : n.edges) {
      if ((n.height > e.end.height) && (e.flow < e.capacity)) {
        int flow = 0;
        if (e.capacity - e.flow < n.eFlow) {
        	flow = e.capacity - e.flow;
        }
        else {
        	flow = n.eFlow;
        }
        n.eFlow -= flow;
        e.end.eFlow += flow;
        e.flow += flow;
        check(e, flow);
        return true;
      }
    }
    return false;
  }

  
  public void check(Edge e, int flow) {
    for (Edge edge : e.end.edges) {
      if (edge.end.equals(e.start)) {
        edge.flow -= flow;
        return;
      }
    }

    e.end.createEdge(e.start, -flow, 0);
  

  }
  
  public Node activeNode() {
	    for (int i = 1; i < allnodes.size()-1; i++) {
	      if (allnodes.get(i).eFlow > 0) {
	        return allnodes.get(i);
	      }
	    }
	    return null;
	  }
  
}
