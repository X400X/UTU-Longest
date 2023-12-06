public class Longest {
    public static void main(String[] args) {
        String s = "";
        
        for (String p : args) {
            int aa = p.length();
            int bb = s.length();
            if (aa > bb) {
                s = p;
            }
        }
        if (s.isEmpty()) {
            System.out.println("No parameters");
        }
        else {System.out.println("Longest parameter: "+s);}


    }
}