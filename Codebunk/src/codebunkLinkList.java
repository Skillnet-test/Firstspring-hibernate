
public class codebunkLinkList {
	
	//root node;
	Node root=null;
	
	
	// add method
	public void add(String item){				
		Node newNode=new Node();
		newNode.setData(item);
		Node temp=null;
		
		if(root==null){
		root=newNode;
		}else{		
		
		temp=root;
		
		while(temp.getNext()!=null){
			temp=temp.getNext();
			
		}
		
		temp.setNext(newNode);	
		
		}		
		
	}
	
	public Node getRoot(){
		return root;
	}
	
	// print method
	public void print(Node root){
	
		while(root!=null){
			System.out.print(" "+root.data);
			root=root.getNext();
		}
		
		System.out.println();
	}
	
	
	

}
