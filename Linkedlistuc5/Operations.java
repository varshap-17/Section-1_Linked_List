package ex.bridgelabzs;

public class Operations {
  //to add at start
	public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
 //add data at middle	
	public static void addDataAtMiddle() {
		LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
	}
  //to add data at end.
	public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    //   insert in between
    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        @SuppressWarnings("unused")
		Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode= new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("\nafter:");
        linkedList.print();
    }
    // pop the 1st data
    public static void popfirst() {        
    	LinkedList linkedList=new LinkedList();
    	linkedList.push(70);
    	linkedList.push(30);
    	linkedList.push(0);
    	linkedList.pop(56);
    	linkedList.print();
    }
    // pop the last data
    public static void popLast() {
    	LinkedList linkedList=new LinkedList();
    	linkedList.push(30);
    	linkedList.push(56);
    	linkedList.push(0);
    	linkedList.pop(70);
    	linkedList.print();
    }
    //delete the node
    public static void deletenode() {
    	LinkedList linkedList=new LinkedList();
    	linkedList.push(70);
    	linkedList.push(40);
    	linkedList.push(30);
    	linkedList.push(56);
    	linkedList.print();
    	linkedList.deleteatposition(2, null);
    	System.out.println("deleted data is 40");
    	linkedList.print();
    }
    //search the data
    public static void searchElement() {
    	LinkedList linkedList=new LinkedList();
    	linkedList.push(70);
    	linkedList.push(30);
    	linkedList.push(56);
		int element=30;
    	int ans=linkedList.search(30);
    	if(ans==30) {
    		System.out.println("element not found");
    	}else
    		System.out.println("element "+element+ " found in the linked list at " +ans);
    }
    //sort the sequence
    public static void sortsequence() {
    	LinkedList linkedList=new LinkedList();
    	linkedList.push(70);
    	linkedList.push(30);
    	linkedList.push(40);
    	linkedList.push(56);
    	System.out.println("Original List:");
    	linkedList.print();
    	linkedList.sortList();
    	System.out.println("\nSorted List:");
    	linkedList.print();
    }
}
