package pkg;

class Node {
public  int frequency; // the frequency of this tree
 public  char data;
 public  Node left, right;
}

public class HuffmanDecode {
	
	static boolean isLeaf (Node temp) {
	    if (temp.left == null && temp.right == null) {
	        return true;
	    }
	    return false;
	}
	
	static void decode(String s, Node root) 
    {
        if (root == null) {
            return;
        }

        Node temp = root;
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < s.length() ; ++i) {
            if (s.charAt(i) == '0') {
                temp = temp.left;
                buf.append("0");
                if (isLeaf(temp)) {
                    String str = buf.toString();
                    if (str.equalsIgnoreCase("00")) {
                        System.out.print("B");
                    }
                    //clear buf
                    buf = new StringBuffer();
                    //move back to the root
                    temp = root;
                } 
            } else if (s.charAt(i) == '1') {
               temp = temp.right;
               buf.append("1");
               if (isLeaf(temp)) {
                   String str = buf.toString();
                   if (str.equalsIgnoreCase("1")) {
                       System.out.print("A");
                    } else if (str.equalsIgnoreCase("01")) {
                       System.out.print("C");
                    }
                   //clear buf
                   buf = new StringBuffer();
                   //move back to the root
                   temp = root;
                } 
            }
        }

        //if (buf.toString().length() > 0) {
          //  throw new Exception ("Input is invalid");
        //}
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decode("1001011", )
	}

}
