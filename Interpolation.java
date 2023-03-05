public class Interpolation {
public static void interpolationSearch(int searchValue,
ArrayList<String> list)
{
System.out.println("Interpolation Search");
int iterationsNum = 0;
int low = 0;
int hight = list.size()-1;
int keyLeft=
Integer.parseInt(list.get(low).substring(0,list.get(low).indexOf("\t")));
int keyRight=
Integer.parseInt(list.get(hight).substring(0,list.get(hight).indexOf("\t")));
while(!Objects.equals(list.get(low), list.get(hight)) && searchValue
>= keyLeft && searchValue<=keyRight)
{
iterationsNum++;
int mid = low + ((searchValue-keyLeft)*(hight-low)/(keyRightkeyLeft));
int keyMid=
Integer.parseInt(list.get(mid).substring(0,list.get(mid).indexOf("\t")));
if(searchValue ==keyMid ) { System.out.println(list.get(mid));
break;}
else if 
{
(searchValue < keyMid)
hight=mid -1;
}
else low = mid+1;
keyLeft=
Integer.parseInt(list.get(low).substring(0,list.get(low).indexOf("\t")));
keyRight=
Integer.parseInt(list.get(hight).substring(0,list.get(hight).indexOf("\t")));
}
if(searchValue == keyLeft)
{
System.out.println(list.get(low));
}
else if (!(searchValue >= keyLeft && searchValue<=keyRight))
System.out.println("Record not found");
System.out.println("Number of iterations = " + iterationsNum);
}
}

