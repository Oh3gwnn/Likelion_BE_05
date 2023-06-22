package javaproject2.week10;

public class BinarySearchTree {
    private static class Node {
        int key;
        Node left;
        Node right;

        public Node(int data) {
            this.key = data;
            left = null;
            right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // 삽입 메서드
    public void insert(int key) {
        root = insertNode(root, key);
    }

    // 삽입 메서드 -> 재귀호출 메서드
    public Node insertNode(Node node, int key) {
        // node == Null -> 부모 노드의 자식 노드가 Null
        if (node == null) {
            node = new Node(key);
            return node;
        }

        // 재귀호출
        // 현재 노드보다 데이터가 작을 경우 왼쪽 트리로 이동
        if (key < node.key) node.left = insertNode(node.left, key);

        // 현재 노드보다 데이터가 클 경우 오른쪽 트리로 이동
        else if(key > node.key) node.right = insertNode(node.right, key);

        // 삽입 X -> 본래 자식 반환
        return node;
    }

    // 탐색 메서드
    public boolean search(int key) {
        return searchNode(root, key);
    }

    // 탐색 재귀함수
    private boolean searchNode(Node node, int key) {
        // 현재 노드 Null
        if (node == null) return false;

        // 탐색 성공
        if (key == node.key) return true;

        // 재귀호출
        // 현재 노드보다 데이터가 작을 경우 왼쪽 서브트리 탐색 결과 반환
        if (key < node.key) return searchNode(node.left, key);

        // 현재 노드보다 데이터가 클 경우 오른쪽 탐색 결과 반환
        else return searchNode(node.right, key);
    }
}