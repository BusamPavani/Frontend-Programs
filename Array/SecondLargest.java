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

class SecondLargest {
public static void main(String[] args) {
int[] arr = {12, 35, 1, 10, 34, 1};
int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for (int num : arr) {
if (num > first) {
second = first;
first = num;
} else if (num > second && num != first) {
second = num;
}
}
System.out.println("Second Largest: " + second);
}
}