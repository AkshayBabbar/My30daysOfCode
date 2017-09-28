	static void levelOrder(Node root){
      //Write your code here
        Queue<Node> queue=new LinkedList();
        queue.add(root);
        while( !queue.isEmpty() ){
            Node tree = queue.remove();
            System.out.print(tree.data +" ");
            if( tree.left !=null ){
                queue.add( tree.left);
            }
            if( tree.right !=null ){
                queue.add( tree.right );
            }
        }
    }
