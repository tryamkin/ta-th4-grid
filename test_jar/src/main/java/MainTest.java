public class MainTest {

    int x =2;
    public int getX(){
        return 3;
    }

    public static void main(String[] args) {
        MainTest c = new SubMain();
        System.out.println(c.x+ "  " + c.getX());
    }
}
        class SubMain extends MainTest{
         public    int x =1;
         public int getX(){
             return x;
    }
}
