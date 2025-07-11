import java.util.Scanner;
class Complex{
        int real;
        int img;
        Complex(int real,int img){
                this.real=real;
                this.img=img;
        }
        Complex add(Complex other){
                return new Complex(this.real+other.real,this.img+other.img);
        }
        Complex mul(Complex other){
                int realpart=(this.real*other.real)-(this.img*other.img);
                int imgpart=(this.real*other.img)+(this.img*other.real);
                return new Complex(realpart,imgpart);
        }
        public String toString(){
                return real+"+"+img+"i";
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter the real part and imaginary part of first complex no:");
                Complex c1=new Complex(sc.nextInt(),sc.nextInt());
                System.out.print("enter the real part and imaginary part of second complex no: ");
                Complex c2=new Complex(sc.nextInt(),sc.nextInt());
                Complex sum=c1.add(c2);
                Complex product=c1.mul(c2);
                System.out.println("The sum of two complex numbers:"+sum);
                System.out.println("The product of two complex numbers:"+product);
                sc.close();
      }
}
