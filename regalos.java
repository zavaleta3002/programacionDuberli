import java.util.Scanner;
public class EstCondMultiple{
static Scanner sc=new Scanner(System.in);
static void mesdelAnho(){
//definir variables
int mesNun;
String mesLetra="";
//datos de entrada
System.out.println("ingrese el numero del mes entre 1-12:");
mesNun=sc.nextint();
//proceso
case 1: mesLetra="Enero";break;
case 2: mesLetra="Febrero";break;
case 3: mesLetra="Marzo";break;
case 4: mesLetra="Abril";break;
case 5: mesLetra="Mayo";break;
case 6: mesLetra="Junio";break;
case 7: mesLetra="Julio";break;
case 8: mesLetra="Agosto";break;
case 9: mesLetra="Setiembre";break;
case 10:mesLetra="Octubre";break;
case 11:mesLetra="Noviembre";break;
case 12:mesLetra="Diciembre";break;
defaul:
mesLetra="No existe"
System.out.println("El mes no es valido!");break;
}
//datos de salida
System.out.println("el mes");
}
public static void main(String[] arg){
  mesdelAnho();
}