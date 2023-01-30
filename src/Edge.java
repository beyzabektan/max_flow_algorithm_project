
public class Edge {
	Node start;
	Node end;
	int flow;
	int capacity;

  Edge(Node start, Node end, int flow, int capacity) {
    this.start = start;
    this.end = end;
    this.flow = flow;
    this.capacity = capacity;
  }

}