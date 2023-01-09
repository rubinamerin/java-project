public class ClassEight {


 public static void red () {
     int a = 7;
     int b = 9;
     int c = a+b;
     System.out.println(c);

    }

    public static int green (){
        int a = 66;
        int b = 99;
        int c =b-a;
        return c ;

    }

   public static boolean yellow() {
        int a = 52;
        int b = 25;
        if (a == b) {
            return true;

        } else
            return false;
    }

    public  void blue (){
     int a =25;
     int b = 35;
     int c =a + b ;
    System.out.println(c);

    }

   public int white() {
       int a =23;
       int b = 32;
       int c =a + b ;
       return c ;

   }

    public static int orange (int a, int b){
     int c = a+b;
     return c ;
    }
    public static int black(int x, int y, int z){
     int t = x+y-z;
     return t ;

    }

    public static void main (String []args ){
    red() ;
    System.out.println(green());
    System.out.println(yellow());
    System.out.println(orange( 10 , 20));
    System.out.println(black(10,30 ,15));
    ClassEight ce =new ClassEight();
    ce.blue();
 System.out.println(ce.white());





















    }
}
