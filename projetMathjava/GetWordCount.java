public class GetWordCount {
    public static int countWords(String s) 
    {
        return s.split("\\s").length;
    }
    public static void main(String args[])
    {
        System.out.println(countWords("coucou on est la"));
    }
}