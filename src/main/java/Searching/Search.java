package Searching;

public class Search {
    static class  Student{
        public int roll_no;
        public String name;

        public Student(int roll_no, String name){
            this.roll_no = roll_no;
            this.name = name;
        }
     }


    public static void main(String[] args) {
        //Search.ArrayMethod();
        Student[] arrs =  new Student[5];
        arrs[0] = new Student(1,"A");
        arrs[1] = new Student(2,"B");
        arrs[2] = new Student(3,"C");
        arrs[3] = new Student(4,"D");
        arrs[4] = new Student(5,"E");
    }

    public static void ArrayMethod(){
        int[] arr = {1,2,3,4,5};
        // int[] intArray = new int[20]; 
        // int[] integerArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
        // int[] initArray;
        String[] strArray= new String[20];
        for(int i = 0; i < strArray.length; i++){
            strArray[i] = "String" + i;
            System.out.println(strArray[i]);
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }

    public static void multiDimensionalArray(){
       int[][] arr = new int[2][3];
       

    }




}
