public class Arrays{
    public static void main(String[] args) {
        //single dimensional  array
        int a[] = {10,20,33,40,55,60,70};
        //multi-dimensional array
        int b[][] = {
            {10,20,30,40,50},
            {60,70,80,90,100}
        };
        //retriving and performing operations
        //single dimensonal array
        System.out.println("single dimensonal array");
        for(int i =0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        //multidimensional array
        System.out.println("multidimensional array");
        for(int i = 0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
               System.out.println(b[i][j]);
            }
        }

    }
}