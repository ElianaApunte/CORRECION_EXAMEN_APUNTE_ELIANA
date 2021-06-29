
package TEST;
import java.util.Scanner;
import COORDENADAS.Punto;

public class PruebaPunto {
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cant; 
        
        System.out.println("Programa que calcula la trayectoria de "
                + "una particula");
        System.out.println("que va atravez del plano cartesiano "
                + "iniciando en (0,0)");
        System.out.println("");
        System.out.println("Ingrese el # de movimientos que realizara "
                + "la particula");
        cant=datos.nextInt();
        
        Punto [] coordenada = new Punto [cant]; 
            
        LlenaDatos (coordenada);
        
        LlenaXY(coordenada);
        
        for(Punto COR:coordenada){
            System.out.println("Estructura de presentacion: ");
            System.out.println("Distancia y cordenadas (x,y)");
            System.out.println(COR);
        }
        
        Suma(coordenada);
        
    }   
    
    public static void LlenaDatos(Punto COR[]){
        double distancia,x=0,y=0;
        double cont=0;
        
        for (int i=0;i<COR.length;i++){
            
            datos.nextLine();
            System.out.println("Ingrese la distancia del mov "+(i+1));
            distancia=datos.nextDouble();
            cont=cont+distancia;
             
            COR[i] = new Punto(distancia,x,y);

        }

    }
    
    public static void LlenaXY (Punto COR[]) {
            double x=0,y=0;
           
            for (int i=0;i<COR.length;i++){
       
              String [] direccion = {"arriba","abajo","izquierda","derecha"};
              int n=(int) (Math.floor(Math.random() *4)); 
           
             if (direccion [n] == "arriba"){
                 x=x;
                 y=y+COR[i].getDistancia();
                }
             
             else if (direccion [n] == "abajo"){
                 x=x;
                 y=y-COR[i].getDistancia();
                }
             
             else if (direccion [n] == "izquierda"){
                 x=x-COR[i].getDistancia();
                 y=y;
                }
             
             else if (direccion [n] == "derecha"){
                 x=x+COR[i].getDistancia();
                 y=y;
                }
             
             double distancia=COR[i].getDistancia();
             COR[i] = new Punto(distancia,x,y);
            
            }
           
        }
    
    public static void Suma(Punto COR[]){
        double cont=0;
        
        for (int i=0;i<COR.length;i++){
            cont=cont+COR[i].getDistancia();
        }    
            
        System.out.println("Distancia recorrida por la particula: ");
        System.out.println(cont);
        
    }
}
