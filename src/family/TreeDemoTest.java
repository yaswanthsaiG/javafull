package family;

public class TreeDemoTest {
    public static void main(String[] args){
        Family test=new Family();
        test=new Family();
        test=new Family();
        test.name="A";
        Family ref=test;
        Family ref1=test;
        ref1.name="B";
        Family ref2=test;
        Family a =new Family();
        a.name="A";
        Family b=new Family();
        a.name="B";
        a=new Family();
        test=a;
        System.out.println(ref2.name);
        System.out.println(ref.name);



    }
}
