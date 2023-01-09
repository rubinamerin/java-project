public class StringConcept {

    public static void main(String[] args) {
    String x = "iamformbangladesh" ;
    System.out.println(x.length());
    System.out.println(x.charAt(5));
    System.out.println(x.indexOf('a'));
    System.out.println(x.lastIndexOf('a')) ;
    System.out.println(x.indexOf('a',x.indexOf('a') +1));


    String s = "pennsylvanianewjersy";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('j'));
        System.out.println(s.lastIndexOf('e')) ;
        System.out.println(s.indexOf('e',s.indexOf('e') +1));;

        //String literal occurance
        String t = "merinjavalearning";
        String t1= "merienjavalearning";
        System.out.println("It will give us totall length of string" + t1.length());
        System.out.println("It will give us char at that index " +t1.charAt(3));
        System.out.println("IT will give us index position" +t1.indexOf('l') );
        System.out.println("IT will give us last occurance" +t1.lastIndexOf('a')) ;
        System.out.println(s.indexOf('a',t1.indexOf('a') +1));;
        //String concat
        String t3 = t +t1 ;
        System.out.println(t3);
        String t4 ="Ayesha";






    }



    }









