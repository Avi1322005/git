public class C extends P
{
    int y = 1000;
    static int b = 5000;

    public C()
    {
    }

    public void childNonStaticMethod()
    {
        System.out.println("C.childNonStaticMethod()");
    }

    public static void childStaticMethod()
    {
        parentStaticMethod();
        System.out.println("C.childStaticMethod()");
    }
}