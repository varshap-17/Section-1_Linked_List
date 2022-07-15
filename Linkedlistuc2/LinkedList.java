package ex.bridgelabzs;

public class LinkedList {
	Node head;
    Node tail;

    public Node  push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;// 56=>30=>70
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }

    public void append(int data) { // 56=> 30=> 70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertInBetween(Node previousNode ,Node newNode){
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
    
    public Node pop(int data) { //30=>70
    	Node tempNode=this.head;
    	this.head=head.next;
    	return tempNode;
    }
    
    public Node popLast() {    //56=>30
    	Node tempNode=head;
    	while(!tempNode.next.equals(tail)) {
    		tempNode=tempNode.next;
    	}
    	this.tail=tempNode;
    	tempNode=tempNode.next;
    	return tempNode;
    }
    public void deleteatposition(int position, Node current) {
    	int size=0;
    		if(position==size) {
    			popLast();
    		}else
    			current=head;
    		for(int i=1; i<position; i++) {
    			current=current.next;
    		}
    		current.next.data=current.data;
    	
    	System.out.println("\n"+position+ "nd node is deleted ");
    	}
    public int search(int element) {
    	if(head==null) {
    		return -1;
    	}
    	int index=0;
    	Node temp=head;
    	while(temp!=null) {
    		if(temp.data==element) {
    			return index;
    		}
    		index++;
    		temp=temp.next;
    	}
    	return -1;
    }
    public void sortList() {
    	Node current=head, index=null;
    	int temp;
    	if(head==null) {
    		return;
    	}else {
    		while(current!=null) {
    			index=current.next;
    			while(index!=null) {
    				if(current.data > index.data) {
    					temp=current.data;
    					current.data=index.data;
    					index.data=temp;
    				}
    				index=index.next;
    			}
    			current=current.next;
    		}
    	}
    }
  }