public class javaString {
    public static void main(String[] args) {
        javaString js = new javaString();
        js.reverseString();
    }

    public void reverseString(){
        String name = "Hello World";
        for(int i = name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
