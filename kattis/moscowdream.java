import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a >= 1 && b >= 1 && c >= 1 && a + b + c >= n && n >= 3 ? "YES" : "NO");
        sc.close();
    }
}