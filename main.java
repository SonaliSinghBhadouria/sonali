package Linkedlist;


public class main {

    Node head;
    private int size;
    main(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    
    // add - first
    public void addfirst(String data){
        Node newNode =new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last
    public void addlast(String data){
        Node newNode =new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print list3
    public void printlist(){
        
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // delete first node
    public void deletefirst(String data){
        if(head == null){
            System.out.println("list is empty");
            return ;
        }size--;
        head = head.next;
    }
    // delete last node
    public void deletelast(String data){   
        if(head == null){
            System.out.println("list is empty");
            return ;
        } size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    // return size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        main list = new main();
        list.addfirst("singh");
        list.addfirst("sonali");
        list.printlist();
        list.addlast("bhadouria");
        list.printlist();
        list.addfirst("hello");
        list.printlist();
        list.deletefirst(null);
        list.printlist();
        list.deletelast(null);
        list.printlist();
        System.out.println(list.getSize()); 
    }
    
}
