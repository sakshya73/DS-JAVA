package com.ds;
public class BST2<K extends Comparable<K>, V> {
	private Node root;

	public void insert(K key, V value) {
		root = insert(root, key, value);
	}

	private Node insert(Node n, K key, V value) {
		if (n == null)
			return new Node(key, value);
		
		int cmp = key.compareTo(n.key);

		if (cmp == 0)
			n.value = value;
		else if (cmp > 0)
			n.right = insert(n.right, key, value);
		else
			n.left = insert(n.left, key, value);
		return n;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node n) {
		if (n == null)
			return;
		inOrder(n.left);
		System.out.println(n.key + " : " + n.value);
		inOrder(n.right);
	}

	private class Node {

		private K key;
		private V value;
		private Node left;
		private Node right;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}

	}
	
	private static class Student implements Comparable<Student> {
		private int rollNo;
		private String name;
		private float cgpa;

		public Student(int rollNo, String name, float cgpa) {
			this.name = name;
			this.rollNo = rollNo;
			this.cgpa = cgpa;
		}

		@Override
		public int compareTo(Student o) {
			if (o == null)
				return +1;
			if (this.cgpa < o.cgpa)
				return -1;
			if (this.cgpa > o.cgpa)
				return +1;
			return 0;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", cgpa=" + cgpa + "]";
		}
	}

	public static void main(String[] args) {
		BST2<Student, String> bst = new BST2<>();
		bst.insert(new Student(1, "a", 1.2f), "Five");
		bst.insert(new Student(2, "b", 2.2f), "wrong spelling");
		bst.insert(new Student(3, "c", 5.2f), "Three");
		bst.insert(new Student(4, "d", 9.2f), "seven");
		bst.insert(new Student(5, "e", 4.2f), "Eight");
		bst.insert(new Student(6, "f", 3.2f), "Six");
		bst.inOrder();
		
	}

}