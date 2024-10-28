public class FlowchartLatihann {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i <= 10) {
            j = 0;
            while (j < 10 - i) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k < i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}