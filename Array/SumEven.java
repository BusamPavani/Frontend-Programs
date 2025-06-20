/*import java.util.Scanner;
class BinarySearch {
public static void main(String[] args) {
int[] arr = {2, 5, 10, 14, 18, 23, 35};
int target = 14;
int low = 0, high = arr.length - 1, mid;
boolean found = false;
while (low <= high) {
mid = (low + high) / 2;
if (arr[mid] == target) {
System.out.println("Element found at index: " + mid);
found = true;
break;
} else if (arr[mid] < target) {
low = mid + 1;
} else {
high = mid - 1;
}
}
if (!found)
System.out.println("Element not found.");
}
}
output:Element found at index: 3*/

/*class SecondLargest {
public static void main(String[] args) {
int[] arr = {12, 35, 1, 10, 34, 1};
int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for (int num : arr) {
if (num > first) {
second = first;
first = num;
} else if (num > second && num !=first) {
second = num;
}
}
System.out.println("Second Largest: "+second);
}
}
output:Second Largest: 34*/

/*class MaxMin {
public static void main(String[] args) {
int[] arr = {12, 3, 45, 6, 78, 1, 0};
int max = arr[0], min = arr[0];
for (int num : arr) {
if (num > max) max = num;
if (num < min) min = num;
}
System.out.println("Max:"+max+",Min:"+min);
}
}
output:Max:78,Min:0*/

/*class Frequency {
public static void main(String[] args) {
int[] arr = {1, 2, 2, 3, 1, 4, 2};
boolean[] visited = new boolean[arr.length];
for (int i = 0; i < arr.length; i++) {
if (visited[i]) continue;
int count = 1;
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] == arr[j]) {
visited[j] = true;
count++;
}
}
System.out.println(arr[i] + " occurs " + count + " times");
}
}
}
output:1 occurs 2 times
2 occurs 3 times
3 occurs 1 times
4 occurs 1 times*/

/*class CommonElements {
public static void main(String[] args) {
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {3, 4, 5, 6, 7};
System.out.println("Common elements:");
for (int i : arr1) {
for (int j : arr2) {
if (i == j) {
System.out.println(i);
break;
}
}
}
}
}
output:Common elements:
3
4
5*/


/*class EvenOddCount {
public static void main(String[] args) {
int[] arr = {3, 6, 9, 12, 15, 18, 21};
int even = 0, odd = 0;
for (int num : arr) {
if (num % 2 == 0)
even++;
else
odd++;
}
System.out.println("Even count:"+even);
System.out.println("Odd count:"+odd);
}
}
output:Even count:3
Odd count:4*/

/*class CountPNZ {
public static void main(String[] args) {
int[] arr = {-5, 0, 3, -1, 2, 0, 4};
int pos = 0, neg = 0, zero = 0;
for (int num : arr) {
if (num > 0)
pos++;
else if (num < 0)
neg++;
else
zero++;
}
System.out.println("Positive:"+pos);
System.out.println("Negative:"+neg);
System.out.println("Zeros:"+zero);
}
}
output:Positive:3
Negative:2
Zeros:2*/

/*import java.util.Scanner;
class InsertElement {
public static void main(String[] args) {
int[] arr = new int[10];
int n = 5;
int i;
for (i = 0; i < n; i++) {
arr[i] = i + 1;
}
Scanner sc = new Scanner(System.in);
System.out.print("Enter element to insert: ");
int elem = sc.nextInt();
System.out.print("Enter position (0 to " + n + "): ");
int pos = sc.nextInt();
for (i = n; i > pos; i--) {
arr[i] = arr[i - 1];
}
arr[pos] = elem;
n++;
System.out.println("Array after insertion:");
for (i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
}
}
output:Enter size: 4
Enter elements:
2
4
8
4
Enter position (0 to 4): 2
Enter value: 6
Array after insertion: 2 4 6 8 4 */

/*class Palindrome {
public static void main(String[] args) {
int[] arr = {1, 2, 3, 2, 1};
boolean isPalindrome = true;
for (int i = 0; i < arr.length / 2; i++) {
if (arr[i] != arr[arr.length - 1 - i]) {
isPalindrome = false;
break;
}
}
if (isPalindrome)
System.out.println("The array is a palindrome.");
else
System.out.println("The array is not a palindrome.");
}
}
output:The array is a palindrome.*/


/*class MatrixMul {
public static void main(String[] args) {
int[][] a = {{1, 2},{3, 4}};
int[][] b = {{5, 6},{7, 8}};
int[][] result = new int[2][2];
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = 0;
for (int k = 0; k < 2; k++) {
result[i][j] += a[i][k] * b[k][j];
}
}
}
System.out.println("Result matrix:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
}
output:Result matrix:
19 22
43 50 
*/

class SumEven {
public static void main(String[] args) {
int[] arr = {3, 6, 9, 12, 15, 18};
int sum = 0;
for (int num : arr) {
if (num % 2 == 0)
sum += num;
}
System.out.println("Sum of even numbers:"+sum);
}
}