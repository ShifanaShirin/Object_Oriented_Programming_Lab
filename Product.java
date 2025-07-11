 import java.util.Scanner;
class Product{
        String pcode;
        String pname;
        int price;
        Product(String pcode,String pname,int price){
                this.pcode=pcode;
                this.pname=pname;
                this.price=price;
        }
        public void display(){
                System.out.println("the lowest product details ");
                System.out.println("product code:"+pcode);
                System.out.println("product name:"+pname);
                System.out.println("price:"+price);

        }
        public static void main(String[] args){
                System.out.println("enter the no of items:");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Product[] items=new Product[n];

                for(int i=0;i<n;i++){
                        System.out.println("enter details for product "+(i+1));
                        System.out.println("enter product code:");

                        String pcode=sc.next();
                        System.out.println("enter the product name:");
                        String pname=sc.next();
                 	System.out.println("enter the price:");
                        int price=sc.nextInt();
                        items[i]=new Product(pcode,pname,price);
                }
                Product lowest=cheapest(items);
                lowest.display();
                sc.close();


        }
        static Product cheapest(Product[] items){
                Product cheap=items[0];
                for(int i=1;i<items.length;i++){
                        if(items[i].price<cheap.price){
                                cheap=items[i];
                        }
                }
                return cheap;
        }


}
