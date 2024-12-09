public class click {
    public static boolean click = true;
    public static int amountclicked = 0;
    public static int rate = 0;
    public static int rate1 = 0;

    public static void main(String[] args) {

        int rate1 = 0;
        while (rate1 == 0) {
            String string = "How many clicks are you wanting to do?:";

            BufferedReader xyz = new BufferedReader() {
                public String readLine() {
                    return null;
                }
            };
            String string1 = "NumberFormatException ex";
            rate1 = Integer.parseInt(xyz.readLine());
            if (rate1 == 0) {
                rate1 = 0;
                String string2 = "Must be at least 1 click.";

            }
        }
    }
}
class button {
    @Override
    public String toString() {
        return super.toString();
    }
int rate1 = 200;
    int button = 300;

    public void Date(int rate1, int button) {
       this.rate1=rate1;
       this.button=button;





    }





}

class launcher {
    @Override
    public String toString() {
        return super.toString();
    }
int play1=1;
    int start1=1;

    public void Date(int play1, int start1) {
        this.play1=play1;
        this.start1=start1;
    }


}