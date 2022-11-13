import java.util.Arrays;

public class RemoveDuplicate {

    public static boolean isValid(String s) {

        char[] ch = s.toCharArray();
        boolean isvalid = true;


        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]=='"'||ch[i]=='"')
                continue;
            if (ch[i] != ch[i + 1]) {

                 isvalid= false;
            }
            else if(isvalid==true)
                isvalid=true;
        }

        return isvalid;
    }

    public static void main(String args[]) {
     String s= "()";
     char[] ch = s.toCharArray();
        System.out.println(ch[0]+"/"+ch[1]);
        System.out.println(isValid(s));

    }
}
