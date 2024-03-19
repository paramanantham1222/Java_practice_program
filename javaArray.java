public class javaArray {
    public static void main(String[] args) {
        javaArray ja = new javaArray();
        //ja.MininumNum();
        ja.MaximumNum();
    }

    public void MininumNum(){
        int a[] = {10,20,3,4,1,59};
        int MinNum = a[0];

        for (int i = 0; i < a.length; i++) {
            if (MinNum > a[i]) {
                MinNum = a[i];
            }
        }
        System.out.println(MinNum);
    }

    public void MaximumNum(){
        int a[] = {10,20,3,4,1,59};
        int MaxNum = a[0];

        for (int i = 0; i < a.length; i++) {
            if (MaxNum < a[i]) {
                MaxNum = a[i];
            }
        }
        System.out.println(MaxNum);
    }
}
