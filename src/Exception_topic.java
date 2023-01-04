public class Exception_topic {
int x=980;
int y=0;





    public static int divivdeByl( int x, int y) {

        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }

    }
        public int divifdeEafp(int x,int y) {

            try {
                return x / y;
            } catch (ArithmeticException e) {
                return 0;
            }




        }






}

