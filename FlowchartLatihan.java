public class FlowchartLatihan {
    public static void main(String[] args) {
        int n = 10;
        int i = n;
        while (i > 0) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}