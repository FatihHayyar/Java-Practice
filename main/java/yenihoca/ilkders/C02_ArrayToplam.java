package yenihoca.ilkders;

public class C02_ArrayToplam {
    public static void main(String[] args) {
/*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */
int arr[]={4,6,5,-10,8,5,20};
int sayi=10;
for(int i=0; i<arr.length; i++){
    for (int j=i+1;j<arr.length;j++){
    if (arr[i]+arr[j]==sayi){
        System.out.println(arr[i]+" "+arr[j]);

    }}


}






    }
}
