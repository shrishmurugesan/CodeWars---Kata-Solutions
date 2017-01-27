package everything;
import java.util.*;

public class TreeMaxSum {
	
	static int maxSum(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int sum = root.value;
		
		int max = sum + Math.max(maxSum(root.left),maxSum(root.right));
		return max;
		
		
		
    }

//	 static int maxSum(TreeNode current, int sum) {
//		
//		 if(current == null)
//			 return 0;
//		 
//		 sum += current.value;
//		 
//		 int max = Math.max(maxSum(current.left,sum), maxSum((current.right),sum));
//		
//		 return max;
//		 
//	}

}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    
}