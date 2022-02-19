// Calculates factorial based on terminal input
class Fact {
    public static void main(String[] args) {
        System.out.print("Fact: ");
        int n = Integer.parseInt(System.console().readLine());
        long res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }

        System.out.println("result: " + res);
    }
}
