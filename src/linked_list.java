public class linked_list {
    static Node head;
    static class Node{
        int value;
        Node next;
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    static Node revsum(Node list1, Node list2) {
        int a = 0, b = 0;
        while (list1 != null && list2 != null) {
                a += list1.value + list2.value;
                list1 = list1.next;
                list2 = list2.next;
        }
        Node node = null;
        while (a > 0) {
            node = new Node(a % 10, null);
            node.next = head;
            head = node;
            a = a / 10;
        }
        return node;
    }
    public static void main(String[] args) {
        Node a = new Node(5,new Node(4,null));
        Node b = new Node(5,new Node(4,null));
        Node c = revsum(a,b);
        while(c!=null){
            System.out.println(c.value);
            c = c.next;
        }
    }
}
