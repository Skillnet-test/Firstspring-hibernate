import java.util.LinkedList;
import java.util.List;


public class testcodebunk {
	
	public static codebunkLinkList root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="a"; String b="b"; String c="c";
		
		codebunkLinkList cblist=new codebunkLinkList();
		cblist.add(a);
		cblist.add(b);
		cblist.add(c);
		
		Node base=cblist.getRoot();
		cblist.print(base);		

	}

}
