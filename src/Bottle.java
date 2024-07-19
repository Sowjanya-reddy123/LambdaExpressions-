interface Pencil
{
    String run(String str);
}

interface subtraction
{
    int sub(int a, int b);
}




public interface Bottle {
    public static void main(String[] args) {

        Pencil p=(r) -> "hey" +r;
        subtraction sb= (a,b) -> a-b;

        System.out.println(p.run("chinnu"));
        sb.sub(3,1);
    }
}
