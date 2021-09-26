package DataStructures;

public class LinkedList<dataType> {
	private class Node<dataType>{
		private dataType data;
		private Node next;
		
	}
	 
	Node head = null;
	Node tail = null;
	
	public void getHead() {
		System.out.println("head -> "+head.data);
	}
	
	public void getTail() {
		System.out.println("tail -> "+tail.data);
		System.out.println("tail.next.data ="+tail.next.data);
	}
	
	
	//add new node
	public void addLast(dataType data) {
		Node node = new Node();
		node.data=data;
		
		//if linkedlist is empty
		if(head == null) {
			head=node;
			tail=node;
			tail.next=head; // this will make it circular linkedlist.
		}else {
			tail.next=node;
			tail=node;
			tail.next=head;  // this will make it circular linkedlist.
		}
		
	}
	
	//insert node at index
	public void insertAt(dataType data,int index) {
		Node node = new Node();
		node.data=data;
		
		
		//at position 1 or first element
		if(index==0) {
			node.next=head;
			head=node;
		
		}
		else {
			Node currentNode=head;
			for(int i=0;i<index-1;i++) {
				currentNode=currentNode.next;
			}
			node.next=currentNode.next;
			currentNode.next=node;
		}
			
	}
	
	//return the length of list
	int count;
	public int length() {
		
		if(head==null) {
			count=0;
		}else if(head==tail) {
			count=1;
		}else {
			count=1;
			Node current = new Node();
			current=head;
			while(current.next != tail) {
				count++;
				current=current.next;
			}
			
			count++;
			
			
		}
		
		System.out.println("length : "+count);
		
		return count;
			
	}
	
	
	
	//deleteNode
	public void deleteNode(int index) {
		
		if (index == 0) {
			head =head.next;
			return ;
		}
		else {
			Node current = head;
			for(int i=0;i<index-1;i++) {
				current= current.next;
			}
			
			current.next = current.next.next;
			
			
		}
	}
		
		
	
	//print linkedlist
	public void showList() {
		Node current = new Node();
		current=head;
		if(head==null) {
			System.out.println("List is empty");
		}else {
			while(current != tail) {
				System.out.print(current.data+" ->");
				if(current==tail) {
					
				}else {
					current=current.next;
				}
				
			};
			
			System.out.print(current.data);
			
			
			System.out.println();
		}
		
		
	}
	
}
