package leetcode.Array;

class node {
	int data;
	node next;
	node(int value){
	data = value;
	}
}

public class Sll {
	node head = null;
	private void insertAtBegin(Sll list, int data) {
		if(head == null) {
			head = new node(data);
			head.next = null;
		}
		else {
			node new_node = new node(data);
			new_node.next = head;
			head = new_node;
		}
	}
	private void insertAtLast(Sll list, int data) {
		node temp = null;
		temp = head;
		if(head == null) {
			head = new node(data);	
		}
		else {
		node new_node = new node(data);
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
		new_node.next = null;
		}
	}
	private void insertAtMid(Sll list, int data, int post) {
		node temp = null;
		if(head == null) {
			head = new node(data);
			return;
		}
		else {
			temp = head;
			if(post <= 0) {
				return;
			}	
			else if(post == 1) {
			insertAtBegin(list, data);
			}
			else {
			for(int i = 0; i < post - 1; i++) {
				temp = temp.next;
			}
			node new_node = new node(data);
			new_node.next = temp.next;
			temp.next = new_node;
		}
	}
	}
	private void deleteFromBegin(Sll list) {
		if(head == null) {
			return;
		}
		else {
			head= head.next;
		}
	}
	private void deleteFromLast(Sll list) {
		if(head == null) {
			return;
		}
		else {
			node temp = null;
			temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	private void deleteFromMid(Sll list, int post) {
		node temp = null;
		if(head == null) {
			return;
		}
		else {
			if(post <= 0) {
				return;
			}
			else if(post == 1) {
				deleteFromBegin(list);
			}
			else {
				temp = head;
				for(int i = 1; i < post - 1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
		}
	}
	private void traverse(Sll list) {
		node temp = head;
		while(temp.next != null) {
		 System.out.println(temp.data);
		 temp = temp.next;
		}
		 System.out.println(temp.data);
	}
public static void main(String[] args) {
Sll singly = new Sll();
singly.insertAtBegin(singly, 25);
singly.insertAtLast(singly, 45);
singly.insertAtMid(singly, 35, 1);
singly.insertAtBegin(singly, 55);
singly.insertAtLast(singly, 75);
singly.insertAtMid(singly, 65, 4);
singly.deleteFromBegin(singly);
singly.deleteFromLast(singly);
singly.deleteFromMid(singly, 2);
singly.deleteFromMid(singly, 2);
singly.traverse(singly);
}
}
