public class test {
    public static void main(String[] args) {

        String a = "CodegymDaNang";
        String newStr = "";
        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i) == a.toLowerCase().charAt(i)){

                newStr += a.charAt(i);
            }else{
                if (i !=0) newStr+= " ";

                newStr += a.toLowerCase().charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
