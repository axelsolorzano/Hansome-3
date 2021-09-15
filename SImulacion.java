
package simulacion;

import java.util.Scanner;


public class SImulacion {
static Scanner teclado = new Scanner(System.in);
static int sumax=0,sumay=0,sumaxy=0,sumax2=0; 
static int b0=0,b0s=0,b0s2,b1=0,b1s=0,b1s2=0;


 public static void  arreglos (){
     //definicion de arreglos y su sumatoria
    int [] x={23,26,30,34,43,48,52,57,58};
    int [] y={651,762,856,1063,1190,1298,1421,1440,1518};
    int [] xy={14973,19812,25680,36142,51170,62304,73892,82080,88044};
    int [] x2={529,676,900,1156,1849,2304,2704,3249,3364};
    int xs=0, ys=0, xys=0, x2s=0;  
        for (int i=0;i<9;i++){
            xs=xs+x[i];
            ys=ys+y[i];
            xys=xys+xy[i];
            x2s=x2s+x2[i];
        }
        sumax=xs;
        sumay=ys;
        sumaxy=xys;
        sumax2=x2s;
  }
 
 public static void formula(){
    //aqui se sacara el b0 y b1
    b1s=9*sumaxy-(sumax*sumay);
    b1s2=9*sumax2-(sumax*sumax);
    b1=b1s/b1s2;
    
    b0s=sumax2*sumay-(sumax*sumaxy);
    b0s2=9*sumax2-(sumax*sumax);
    b0=b0s/b0s2;
 } 
    public static void main(String[] args) {
        arreglos();
        formula();
        int prediccion=0,n=0,r=0;
        System.out.println("sumatoria de x: "+sumax);
        System.out.println("sumatoria de y: "+sumay);
        System.out.println("sumatoria de xy: "+sumaxy);
        System.out.println("sumatoria de xcuadrada: "+sumax2);
        System.out.println("b1: "+b1);
        System.out.println("b0: "+b0);
        
        //en esta parte se saca la prediccion instruida por el usuario
       do{System.out.println("Dame una valor para predecir");
        n= teclado.nextInt();
        prediccion=b0+b1;
        prediccion = prediccion*n;
        System.out.println("La prediccion es: "+prediccion);
        System.out.println("Quieres volver a predecir?\n1-si 2-no");
        r = teclado.nextInt();
        }while(r<2);
        System.out.println("Cerando proceso");
    }
    
}
