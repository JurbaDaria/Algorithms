public class BinarySearch {
public static void binarySearch(int searchValue, ArrayList<String> list)
{
System.out.println("Binary Search");
Collections.sort(list);
int iterationsNum=0;
int first=0;
int last = list.size()-1;
int key;
int mid = (first + last)/2;
while( first<=last)
{
key =
Integer.parseInt(list.get(mid).substring(0,list.get(mid).indexOf("\t")));
if(key==searchValue)
{
System.out.println(list.get(mid));
break;
}
else if(key>searchValue)
{
last = mid-1;
}
else first = mid+1;
iterationsNum++;
mid = (first + last)/2;
}
if(first>last) System.out.println("Record not found");
System.out.println("Number of iterations = " + iterationsNum);
}
}
