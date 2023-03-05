class Fibonacci {
public static int min(int o, int n)
{
return (o <= n) ? o : n;
}
public static void Fibonacci(int searchValue, ArrayList<String> list)
{
System.out.println("\nFibonacci Search");
int q = 0;
int p = 1;
int i = q + p;
int n=50;
int iterationsNum =0;
while (i < n) {
q = p;
p = i;
i = q + p;
}
int offset = -1;
while (i > 1) {
int j = min(offset + q, n - 1);
String[] l = list.get(j).split("\\t");
int key = Integer.valueOf(l[0]);
if (key < searchValue ) {
i = p;
p = q;
q = i - p;
offset = j;
}
else if (key > searchValue ) {
i = q;
p = p - q;
q = i - p;
}
else
{
System.out.println(list.get(j));
System.out.println("Number of iterations = " +iterationsNum);
return;
}
iterationsNum++;
}
String[] l = list.get(n-1).split("\\t");
int key = Integer.valueOf(l[0]);
if 
{
(key == searchValue && p == 1)
System.out.println(list.get(n-1));
System.out.println("Number of iterations = " + iterationsNum);
}
else System.out.println("Record not found");
}
}
