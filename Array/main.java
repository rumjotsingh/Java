import java.util.Scanner;
class main {
    int l;
    int b;
    main(int l,int b){
        this.l=l;
        this.b=b;
    }
    main(){
        l=0;
        b=0;
    }//constructor overloading
    int area(){
        return l*b;
    }//method
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }//thee method is overloaded
    public static void main(String[] args) {
        main rect = new main(5,10);
        System.out.println("Area: " + rect.area()
        
        );
    }
    public static void main1(String[] args) {
        int arr[]={1,2,3,4,5};
        int [] arr1=new int[5];//declarting and instantiating
        //loop to assign values
        for(int i=0;i<arr1.length;i++){
            arr1[i]=i+1;
        }  
        //sum of array by the scanner
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("Sum: " + sum);
    }
    punlic static void main2(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};//2d array
        //printing 2d array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mainDemoTryCatch(String[] args) {
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Finally block executed");
        }
        int arr[]={1,2,3};
        try{
            System.out.println(arr[5]);
        }catch(Expection e){
            System.out.println("Array index out of bounds");
        }
        System.ou.println("End of program");
    }
}