/*Program 7
import java.util.Scanner;
class InsertElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int arr[] = new int[n+1];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter position (0 to " + n + "): ");
int pos = sc.nextInt();
System.out.print("Enter value: ");
int val = sc.nextInt();
for(int i=n; i>pos; i--) {
arr[i] = arr[i-1];
}
arr[pos] = val;
System.out.print("Array after insertion: ");
for(int i=0; i<=n; i++) {
System.out.print(arr[i]+" ");
}
}
}
output:Enter size: 4
Enter elements:
12
27
21
4
Enter position (0 to 4): 3
Enter value: 20
Array after insertion: 12 27 21 20 4 */

/*Program 5
import java.util.Scanner;
class RemoveElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++) {
System.out.print("Enter value " + (i+1) + ": ");
arr[i] = sc.nextInt();
}
System.out.print("Enter value to remove: ");
int value = sc.nextInt();
int count = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
count++;
}
}
int newArr[] = new int[count];
int j = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
newArr[j] = arr[i];
j++;
}
}
System.out.print("Array after removing " + value + ": ");
for(int i=0; i<newArr.length; i++) {
System.out.print(newArr[i]+" ");
}
}
}
output:
Enter number of elements: 4
Enter value 1: 12
Enter value 2: 3
Enter value 3: 27
Enter value 4: 4
Enter value to remove: 3
Array after removing 3: 12 27 4 */

class Array
{
public static void main(String args[])
{
int sum=0;
int a[]=new int[3];
a[0]=1;
a[1]=3;
a[2]=4;
sum=a[0]+a[1]+a[2];
System.out.println("the sum is"+ sum);
}
}