public class LinearSearch {
public static void linearSearch(int searchValue, ArrayList<String> list)
{
System.out.println("Linear Search");
int iterationsNum=0,keyValue;
String substring i;
for(String i:list)
{
iterationsNum++;
String[] line = i.split("\\t");
keyValue = Integer.valueOf(line[0]);
if(keyValue==searchValue) {
System.out.println(i);
break;
}
}
System.out.println("Number of iterations = " + iterationsNum);
}
}
