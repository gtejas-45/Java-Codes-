package Problems.Practice;

public class StarRemoval {
    public static String StarRemove(String str){
        String newstr="";
        char[] charArr=str.toCharArray();
        for(char a:charArr){
            if(a=='*'){
                continue;
            }
            else{
                newstr=newstr + a;
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(StarRemove("aaba*a"));
    }
}
