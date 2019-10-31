import java.util.Arrays;
import java.util.Scanner;

public class BST {

	private class Node{
		int data;
		Node leftNode;
		Node righNode;
	}
	
	private Node rootNode;
	
	public BST(int[] arr) {
		this.rootNode = construct(arr, 0, arr.length-1);
	}
	
	private Node construct(int[] arr, int low,int high) {
		if(low>high)
			return null;
		
		int mid = (low+high)/2;
		Node node = new Node();
		node.data = arr[mid];
		
		node.leftNode = construct(arr, low, mid-1);
		node.righNode = construct(arr, mid+1, high);
		return node;	
	}
	
	public void display() {
		this.display(this.rootNode);
	}
	
	private void display(Node node) {
		String str = "";
		if(node.leftNode==null) {
			str += "NULL";
		}else {
			str += node.leftNode.data ;
		}
		str += " -> " + node.data + " <- ";
		if(node.righNode==null) {
			str += "NULL";
		}else {
			str+= node.righNode.data;
		}
		
		System.out.println(str);
		
		if(node.leftNode !=null) {
			display(node.leftNode);
		}
		
		if(node.righNode !=null) {
			display(node.righNode);
		}
	}
	
	public boolean find(int item) {
		return this.find(this.rootNode, item);
	}

	private boolean find(Node node, int item) {
		if(node == null)
			return false;
		
		if(item >node.data) {
			return find(node.righNode, item);
		}else if(item < node.data) {
			return find(node.righNode, item);
		}else {
			return true;
		}
		
	}
	
	public int max() {
		return this.max(this.rootNode);
	}
	
	private int max(Node node) {
		
		if(node.righNode== null) {
			return node.data;
		}
		return max(node.righNode);
	}
	
	public int min() {
		return this.min(this.rootNode);
	}
	
	private int min(Node node) {
		
		if(node.leftNode== null) {
			return node.data;
		}
		return min(node.leftNode);
	}
	
	public void add(int item) {
		this.add(this.rootNode, item);
	}
	
	private void add(Node node,int item) {
		if(item > node.data) {
			if(node.righNode == null) {
				Node a= new Node();
				a.data=item;
				node.righNode=a;
			}else {
				add(node.righNode, item);
			}
		}
		
		if(item < node.data) {
			if(node.leftNode == null) {
				Node a= new Node();
				a.data=item;
				node.leftNode=a;
			}else {
				add(node.leftNode, item);
				}
		}
	}
	
	public static void main( String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in BST");
		int n = s.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elemwnts ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		// 9 8 3 10 1 6 14  4 7 13
		Arrays.sort(a);
		BST bst = new BST(a);
		bst.display();
		System.out.println(bst.find(33));
		System.out.println(bst.find(20));
		System.out.println(bst.max());
		System.out.println(bst.min());
		bst.add(2);
		bst.add(20000);
		System.out.println(bst.max());
		System.out.println(bst.min());
	}
}
