package yenihoca.ilkders;

public class C02_ForDolar {
    public static void main(String[] args) {
        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
String str="$1 $12 €34 €56 $45 €78";
String starr[]=str.split(" ");
int dolarToplami=0;
int euroToplami=0;
for (String w:starr) {
    if (w.startsWith("$")){
        w=w.replace("$","");
        dolarToplami+=Integer.valueOf(w);

    }else if (w.startsWith("€")){
        w=w.replace("€","");
        euroToplami+=Integer.valueOf(w);
    }


}
        System.out.println("dolarToplami="+dolarToplami);
        System.out.println("euroToplami="+euroToplami);






    }
}
