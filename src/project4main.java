
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class project4main {
	 public static void main(String[] args) throws FileNotFoundException {
		 	Scanner input = new Scanner(new File(args[0]));
	        PrintStream output = new PrintStream(args[1]);
	        ArrayList<Vehicle> greenTrains = new ArrayList<Vehicle>();
	        ArrayList<Vehicle> redTrains = new ArrayList<Vehicle>();
	        ArrayList<Vehicle> greenReindeers = new ArrayList<Vehicle>();
	        ArrayList<Vehicle> redReindeers = new ArrayList<Vehicle>();
	        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	        int myCounter = 1;
	        int numberOfGifts = 0;
	        ArrayList<Bag> a = new ArrayList<Bag>();
	        ArrayList<Bag> ab = new ArrayList<Bag>();
	        ArrayList<Bag> ac = new ArrayList<Bag>();
	        ArrayList<Bag> ad = new ArrayList<Bag>();
	        ArrayList<Bag> ae = new ArrayList<Bag>();
	        ArrayList<Bag> abd = new ArrayList<Bag>();
	        ArrayList<Bag> abe = new ArrayList<Bag>();
	        ArrayList<Bag> acd = new ArrayList<Bag>();
	        ArrayList<Bag> ace = new ArrayList<Bag>();
	        int b = 0;
	        int c = 0;
	        int d = 0;
	        int e = 0;
	        int bd = 0;
	        int be = 0;
	        int cd = 0;
	        int ce = 0;

		    
		    
		    int numberOfGreenTrains = input.nextInt();
		    myCounter += numberOfGreenTrains;
		    if (numberOfGreenTrains != 0) {
		    	for (int i=0 ; i < numberOfGreenTrains; i ++) {
		    		Vehicle vehicle = new Vehicle(1, (vehicles.size()+1), input.nextInt());
		    		vehicles.add(vehicle);
		    		greenTrains.add(vehicle);

		    	}
		    }
		    
		    
		    int numberOfRedTrains = input.nextInt();
		    myCounter += numberOfRedTrains;
		    if (numberOfRedTrains != 0) {
				for (int i = 0; i < numberOfRedTrains; i++) {
					Vehicle vehicle = new Vehicle(2, (vehicles.size()+1), input.nextInt());
					vehicles.add(vehicle);
					redTrains.add(vehicle);
				} 
			}
		    
		    
		    int numberOfGreenReindeers = input.nextInt();
		    myCounter += numberOfGreenReindeers;
		    if (numberOfGreenReindeers != 0) {
		    	for (int i=0 ; i < numberOfGreenReindeers; i ++) {
		    		Vehicle vehicle = new Vehicle(3, (vehicles.size()+1), input.nextInt());
		    		vehicles.add(vehicle);
		    		greenReindeers.add(vehicle);
		    	}
		    }
			
		    
		    int numberOfRedReindeers = input.nextInt();
		    myCounter += numberOfRedReindeers;
		    if (numberOfRedReindeers != 0) {
				for (int i = 0; i < numberOfRedReindeers; i++) {
					Vehicle vehicle = new Vehicle(4, (vehicles.size()+1), input.nextInt());
					vehicles.add(vehicle);
					redReindeers.add(vehicle);
				} 
			}
		    
		    
		    
		    
		    int bagCounter = (vehicles.size() + 1);
		    int numberOfBags = input.nextInt();
		    
		     while (input.hasNext()) {
		    	 String bagType = input.next();
		    	 if (bagType.equals("a")) {
		    		 int capacity = input.nextInt();
		    		 a.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("b")) {
		    		 int capacity = input.nextInt();
		    		 b += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("c")) {
		    		 int capacity = input.nextInt();
		    		 c += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("d")) {
		    		 int capacity = input.nextInt();
		    		 d += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 
		    	 if (bagType.equals("e")) {
		    		 int capacity = input.nextInt();
		    		 e += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("ab")) {
		    		 int capacity = input.nextInt();
		    		 ab.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("ac")) {
		    		 int capacity = input.nextInt();
		    		 ac.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("ad")) {
		    		 int capacity = input.nextInt();
		    		 ad.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("ae")) {
		    		 int capacity = input.nextInt();
		    		 ae.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("bd")) {
		    		 int capacity = input.nextInt();
		    		 bd += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("be")) {
		    		 int capacity = input.nextInt();
		    		 be += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("cd")) {
		    		 int capacity = input.nextInt();
		    		 cd += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("ce")) {
		    		 int capacity = input.nextInt();
		    		 ce += capacity;
		    		 numberOfGifts += capacity;
		    		 
		    	 }
		    	 
		    	 if (bagType.equals("abd")) {
		    		 int capacity = input.nextInt();
		    		 abd.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("abe")) {
		    		 int capacity = input.nextInt();
		    		 abe.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("acd")) {
		    		 int capacity = input.nextInt();
		    		 acd.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		 
		    		 bagCounter ++;
		    	 }
		    	 
		    	 if (bagType.equals("ace")) {
		    		 int capacity = input.nextInt();
		    		 ace.add(new Bag(bagCounter, capacity));
		    		 numberOfGifts += capacity;
		    		
		    		 bagCounter ++;
		    	 }
		     }
		     
		     
		     
		     
		     Algorithm pr = new Algorithm((bagCounter + 9));
		     
		     for (Vehicle v: vehicles) {
		    	 pr.allnodes.get(v.id).height = 1;
		     }
		     
		     for (int i = 1; i< (pr.allnodes.size()-1); i++) {
		    	 if (pr.allnodes.get(i).height != 1) {
		    		 pr.allnodes.get(i).height = 2;
		    	 }
		     }
		     
		     
		     for (int i = 0; i < a.size(); i++) {
		    	 pr.createEdge(0, a.get(i).id, a.get(i).capacity);
	    		 for (int j = 0; j < vehicles.size(); j++) {
	    			 pr.createEdge(a.get(i).id, vehicles.get(j).id, 1);
	    		 }
		     }
		     
		     
		     for (int i = 0; i < ab.size(); i++) {
				pr.createEdge(0, ab.get(i).id, ab.get(i).capacity);
				for (int j = 0; j < greenTrains.size(); j++) {
					pr.createEdge(ab.get(i).id, greenTrains.get(j).id, 1);
				}
				for (int j = 0; j < greenReindeers.size(); j++) {
					pr.createEdge(ab.get(i).id, greenReindeers.get(j).id, 1);
				} 
			}
		     
		     
		     for (int i = 0; i < ac.size(); i++) {
				pr.createEdge(0, ac.get(i).id, ac.get(i).capacity);
				for (int j = 0; j < redTrains.size(); j++) {
					pr.createEdge(ac.get(i).id, redTrains.get(j).id, 1);
				}
				for (int j = 0; j < redReindeers.size(); j++) {
					pr.createEdge(ac.get(i).id, redReindeers.get(j).id, 1);
				} 
			}
		     
		     for (int i = 0; i < ad.size(); i++) {
					pr.createEdge(0, ad.get(i).id, ad.get(i).capacity);
					for (int j = 0; j < greenTrains.size(); j++) {
						pr.createEdge(ad.get(i).id, greenTrains.get(j).id, 1);
					}
					for (int j = 0; j < redTrains.size(); j++) {
						pr.createEdge(ad.get(i).id, redTrains.get(j).id, 1);
					} 
				}
		     
		     for (int i = 0; i < ae.size(); i++) {
					pr.createEdge(0, ae.get(i).id, ae.get(i).capacity);
					for (int j = 0; j < greenReindeers.size(); j++) {
						pr.createEdge(ae.get(i).id, greenReindeers.get(j).id, 1);
					}
					for (int j = 0; j < redReindeers.size(); j++) {
						pr.createEdge(ae.get(i).id, redReindeers.get(j).id, 1);
					} 
				}
		     
		     for (int i = 0; i < abd.size(); i++) {
					pr.createEdge(0, abd.get(i).id, abd.get(i).capacity);
					for (int j = 0; j < greenTrains.size(); j++) {
						pr.createEdge(abd.get(i).id, greenTrains.get(j).id, 1);
					}
				}
		     
		     for (int i = 0; i < abe.size(); i++) {
					pr.createEdge(0, abe.get(i).id, abe.get(i).capacity);
					for (int j = 0; j < greenReindeers.size(); j++) {
						pr.createEdge(abe.get(i).id, greenReindeers.get(j).id, 1);
					}
				}
		     
		     for (int i = 0; i < acd.size(); i++) {
					pr.createEdge(0, acd.get(i).id, acd.get(i).capacity);
					
					for (int j = 0; j < redTrains.size(); j++) {
						pr.createEdge(acd.get(i).id, redTrains.get(j).id, 1);
					} 
				
		     }
		     
		     for (int i = 0; i < ace.size(); i++) {
					pr.createEdge(0, ace.get(i).id, ace.get(i).capacity);
					
					for (int j = 0; j < redReindeers.size(); j++) {
						pr.createEdge(ace.get(i).id, redReindeers.get(j).id, 1);
					} 
				
		     }
		     
		     
			pr.createEdge(0, bagCounter, b);
    		 for (int i = 0; i < greenTrains.size(); i++) {
    			 pr.createEdge(bagCounter, greenTrains.get(i).id, b);
    		 }
    		 for (int i = 0; i < greenReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, greenReindeers.get(i).id, b);
    		 }
    		 bagCounter ++;
    		 
    		 
    		 pr.createEdge(0, bagCounter, c);
    		 for (int i = 0; i < redTrains.size(); i++) {
    			 pr.createEdge(bagCounter, redTrains.get(i).id, c);
    		 }
    		 for (int i = 0; i < redReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, redReindeers.get(i).id, c);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, d);
    		 for (int i = 0; i < greenTrains.size(); i++) {
    			 pr.createEdge(bagCounter, greenTrains.get(i).id, d);
    		 }
    		 for (int i = 0; i < redTrains.size(); i++) {
    			 pr.createEdge(bagCounter, redTrains.get(i).id, d);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, e);
    		 for (int i = 0; i < greenReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, greenReindeers.get(i).id, e);
    		 }
    		 for (int i = 0; i < redReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, redReindeers.get(i).id, e);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, bd);
    		 for (int i = 0; i < greenTrains.size(); i++) {
    			 pr.createEdge(bagCounter, greenTrains.get(i).id, bd);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, be);
    		 for (int i = 0; i < greenReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, greenReindeers.get(i).id, be);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, cd);
    		 for (int i = 0; i < redTrains.size(); i++) {
    			 pr.createEdge(bagCounter, redTrains.get(i).id, cd);
    		 }
    		 bagCounter ++;
    		 
    		 pr.createEdge(0, bagCounter, ce);
    		 for (int i = 0; i < redReindeers.size(); i++) {
    			 pr.createEdge(bagCounter, redReindeers.get(i).id, ce);
    		 }
    		 bagCounter ++;
    		 
    		 
		     
		     for (int i = 0; i < vehicles.size(); i ++) {
		    	 pr.createEdge(vehicles.get(i).id, bagCounter, vehicles.get(i).capacity);
		     }
		    

		    output.println((numberOfGifts - pr.endingFlow(vehicles)));
	
		  }
}
