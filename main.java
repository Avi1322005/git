public class Main
{
    public static void main(String[] args)
    {
        C obj = new C();

        obj.parentNonStaticMethod();
        obj.childNonStaticMethod();

        P.parentStaticMethod();
        C.childStaticMethod();
    }
}