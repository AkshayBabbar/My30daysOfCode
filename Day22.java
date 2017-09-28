	public static int getHeight(Node root){
      //Write your code here
        if(root == null){
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int maximum = (int)Math.max(leftHeight,rightHeight);
            return 1 + maximum;
    }
