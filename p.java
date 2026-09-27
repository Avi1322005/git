 public class P
{
    int x = 100;
    static int a = 50;

    public P()
    {
    }

    public void parentNonStaticMethod()
    {
        System.out.println("P.parentNonStaticMethod()");
    }

    public static void parentStaticMethod()
    {
        System.out.println("P.parentStaticMethod()");
    }
}