    public static Node removeDuplicates(Node head) {
      //Write your code here
        if(head == null){
            return null;
        }
        Node curr = head;
            while(curr.next!=null){
                if(curr.data == curr.next.data)
                {
                    curr.next = curr.next.next;
                }
                else
                    curr=curr.next;
            }
        return head;
    }
