public class Lab5 {
    //эпсилон
    static double EPSILON=0.001;

    //начальная точка
    static double x=4;

    //счетчик итераций
    static int k=0;

    public static void main(String[] args) {
        printData(k,x);

        while(true){
            k++;
            double new_x=func(x);
            double diff=Math.abs(new_x-x);
            printData(k,new_x,diff);
            x=new_x;

            if(diff<=EPSILON){
                System.out.printf("\nx=%s",x);
                break;
            }

        }
    }

    public static double func(double x){
        return Math.pow(12*x+10,1.0/3.0);
    }

    public static void printData(int k, double x, double diff){
        System.out.printf("k= %s    x(%s)= %s    x(k)-x(k-1)= %s\n",k,k,x,diff);
    }

    public static void printData(int k, double x){
        System.out.printf("k= %s    x(%s)= %s\n",k,k,x);
    }
}