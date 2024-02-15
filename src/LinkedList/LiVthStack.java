package LinkedList;

import LinkedList.LlVthQueue.queue;

public class LiVthStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()) {
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
