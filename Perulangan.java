public class Perulangan {
    public static void main(String[] args) {
        /*NIM saya = 244107060144 */

        for (int n = 1; n <= 44; n++) {
            if (n % 2 != 0){
                System.out.print("* ");
            } else if (n == 6 || n == 10){
                continue;
            } else {
                System.out.print(n + " ");
            }
        }
    }
}
