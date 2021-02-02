package edu.princeton.cs.algs4;

//A simple Java program for traversal of a linked list 
class LinkedList { 
 Node head; // head of list 

 /* Linked list Node.  This inner class is made static so that 
    main() can access it */
 static class Node { 
     int data; 
     Node next; 
     Node(int d) 
     { 
         data = d; 
         next = null; 
     } // Constructor 
 } 

 /* This function prints contents of linked list starting from head */
 public void printList() 
 { 
     Node n = head; 
     while (n != null) { 
         System.out.print(n.data + " "); 
         n = n.next; 
     } 
 }
 
 public static int mystery (Node first) {
	 int x = 0;
	 int i = 0;
	 for (Node y = first; y != null; y = y.next, i++){
	 x += (i % 2 == 0)? y.data : 0;
	 }
	 return x;
	}


 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args) 
 { 
     /* Start with the empty list. */
     LinkedList list = new LinkedList(); 

     list.head = new Node(1); 
     Node second = new Node(2); 
     Node third = new Node(3); 
     Node fourth = new Node(4); 
     Node fifth = new Node(5); 
     Node sixth = new Node(6); 
     Node seven = new Node(7); 
     Node eight = new Node(8); 
     Node nine = new Node(9); 
     Node ten = new Node(10); 

     list.head.next = second; // Link first node with the second node 
     second.next = third; // Link second node with the third node 
     third.next = fourth;
     fourth.next = fifth;
     fifth.next = sixth;
     sixth.next = seven;
     seven.next = eight;
     eight.next = nine;
     nine.next = ten;

     list.printList();
     System.out.println(""); 
     System.out.println(LinkedList.mystery(list.head));
     
 } 
}