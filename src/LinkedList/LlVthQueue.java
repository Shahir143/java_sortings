package LinkedList;
//LinkedList with Queue

public class LlVthQueue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode =new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next =newNode;
            tail=newNode;
        }

        public static int pop(){
         if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
         }
         int front=head.data;
         if(tail==head){
            tail=head=null;
         }else{
            head=head.next;
         }
         return front;   
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("QUEUE IS EMPTY");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(5);
        q.add(2);
        q.add(8);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
            
        }
    }
}
