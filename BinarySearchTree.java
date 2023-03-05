class BinarySearchTree {
int iterationsNum =0;
class Node {
String key;
Node left;
Node right;
public Node(String data){
key = data;
left = right = null;
}
}
Node root;
BinarySearchTree(ArrayList<String> list){
root = null;
for(int i = 0;i<list.size()-1;i++)
{
this.insert(list.get(i));
}
}
void insert(String key) {
root = insert_Rec(root, key);
}
Node insert_Rec(Node root, String key) {
(root == null) {
if
root = new Node(key);
return root;
}
int k = Integer.parseInt(key.substring(0, key.indexOf("\t")));
int keyr = Integer.parseInt(root.key.substring(0,
root.key.indexOf("\t")));
if 
{
(k < keyr)
root.left = insert_Rec(root.left, key);
} else if 
{
(k > keyr)
root.right = insert_Rec(root.right, key);
}
return root;
}
void search(int key) {
System.out.println("\nBinary Search Tree");
root = search_Rec(root, key);
}
Node search_Rec(Node root, int key) {
iterationsNum++;
int keyr = Integer.parseInt(root.key.substring(0,
root.key.indexOf("\t")));
if 
{
( keyr==key)
System.out.println(root.key);
System.out.println("Number of iterations = " + iterationsNum);
return root;
}

if
(keyr> key)
return search_Rec(root.left, key);
return search_Rec(root.right, key);
}
}
