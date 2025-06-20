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

/*Program 13
class Array
{
public static void main(String args[])
{
int sum=0;
int a[]=new int[3];
a[0]=12;
a[1]=3;
a[2]=4;
sum=a[0]+a[1]+a[2];
System.out.println("the sum is"+ sum);
}
}
output:the sum is19*/

/*Program 14
class Array
{
public static void main(String args[])
{
float avg;
int sum=0;
int a[]=new int[3];
a[0]=2;
a[1]=0;
a[2]=4;
sum=a[0]+a[1]+a[2];
 avg=sum/3;
System.out.println("the avg is"+avg);
}
}
output:the avg is2.0*/
/*Program
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the values of an array a:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("the values of an array b:");
for(i=0;i<n;i++)
{
System.out.println(b[i]=a[i]);
}
s.close();
}
}
output:
Enter the size of an array:4
Enter the values of an array:12
21
20
8
the values of an array a:
12
21
20
8
the values of an array b:
12
21
20
8*/

/*
Program 9
import java.util.Scanner;
class Array{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of values");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("enter the numbers"+n);
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the element to find");
int b=s.nextInt();
int index=-1;
for(int i=0;i<n;i++)
{
if(a[i]==b)
{
index=i-1;
System.out.println("the index is"+i);
}
}
}
}
output:Enter the no.of values
4
enter the numbers4
1
2
3
4
enter the element to find
2
the index is1*/
/*Program 10
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            arr[i] = s.nextInt();
        }

        System.out.println("Original elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Reverse elements:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
output:Enter number of elements:
3
Enter array element 1:
9
Enter array element 2:
8
Enter array element 3:
4
Original elements:
9
8
4
Reverse elements:
4
8
9*/
/*Program 5
class Array{
public static void main(String args[])
{
int arr[]={3,1,3,2};
for(int i=0; i<arr.length-1;i++)
{
for(int j=1; j<arr.length; j++)
{
if(arr[i]==arr[j])
{
System.out.println("duplicate numbers"+arr[i]);
}
}
}
}
}
output:duplicate numbers3
duplicate numbers1
duplicate numbers3*/
/*Program 8
import java.util.Scanner;
class Array {
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
System.out.print(newArr[i] + " ");
}
}
}
output:Enter number of elements: 5
Enter value 1: 1
Enter value 2: 2
Enter value 3: 3
Enter value 4:
4
Enter value 5: 5
Enter value to remove: 3
Array after removing 3: 1 2 4 5*/

/*class Array
{
public static void main(String args[])
{  int arr[]={2,5,9,4};
int max=arr[0], min=arr[1];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}
System.out.println("max"+max);
System.out.println("min"+min);
}
}o/p:
max9
min2*/
/*
class Array
{
public static void main(String args[])
{
int a[]={20,12,4,21};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.lenth;j++)
{
int[] a = {20, 12, 27, 4, 21};
        int temp;
 for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        
        System.out.println("Second largest number is: " + a[1]);
    }
}
}
}
output:Second largest number is: 21*/


/*Program 4 
import java.util.Scanner;
public class Array{
public static void main(String args[])
{
int n;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={21,20,27,12,89};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
found = true;
}
}
if(found)
{
System.out.println("found a specified value ");
}
else {
System.out.println(" not found a specified value");
}
}
}
output:Enter the value of n:4
 not found a specified value

Enter the value of n:12
found a specified value*/

/*Program 7
import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int n,position;
Scanner s=new Scanner(System.in);
int a[]={23,17,3,14,12};
System.out.print("Enter the value of n to insert into an array:");
n=s.nextInt();
System.out.print("Enter the position (0 to " + a.length + ") to insert n: ");
position=s.nextInt();
int arr[]=new int[a.length+1];
for(int i=0,k=0;i<arr.length;i++)
{
if(i == position)
{
 arr[i]=n;
}
else{
arr[i]=a[k];
k++;
}
}
System.out.println("Array after insertion:"); 
for(int val: arr )
{
System.out.println(val+" ");
}
}
}
output:
Enter the value of n to insert into an array:27
Enter the position (0 to 5) to insert n: 4
Array after insertion:
23 
17 
3 
14 
27 
12 */

/*
Program 15
class Array {
   public static void main(String[] args) {
 int arr[] = {12, 7, 9, 14, 5, 6};
System.out.println("Even numbers:");
  printEven(arr);
 System.out.println("Odd numbers:");
 printOdd(arr);
    } 
static void printEven(int[] arr)

{
 for (int num: arr) {
 if (num % 2 == 0) {
 System.out.print(num +" ");
 }
 } System.out.println();
 }
static void printOdd(int[] arr) { 
 for (int num : arr) 
{
 if (num % 2 != 0)
 {
  System.out.print(num +" ");
 }
 }
 System.out.println();
}
}
output:
Even numbers:
12 14 6
Odd numbers:
7 9 5*/

import java.util.Scanner;
class CommonValues {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n = sc.nextInt();
int arr1[] = new int[n];
System.out.println("Enter elements of first array:");
for(int i=0; i<n; i++) {
arr1[i] = sc.nextInt();
}
System.out.print("Enter size of second array: ");
int m = sc.nextInt();
int[] arr2 = new int[m];
System.out.println("Enter elements of second array:");
for(int i=0; i<m; i++) {
arr2[i] = sc.nextInt();
}
System.out.print("Common values: ");
for(int i=0; i<n; i++) {
for(int j=0; j<m; j++) {
if(arr1[i]==arr2[j]) {
System.out.print(arr1[i] + " ");
break;
}
}
}
}
}
