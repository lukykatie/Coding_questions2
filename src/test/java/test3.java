public class test3 {


    public static void main(String[] args) {

        String str ="kuugkfgdggtjj";

        String unique ="";
        for(int i=0; i<=str.length()-1; i++){

            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first==last){
                unique+=ch;

            }
        }
        System.out.println(unique);
    }
}
