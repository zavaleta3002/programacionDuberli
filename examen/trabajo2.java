import java.util.Scanner;
class Examen_GFYM{ 
static Scanner sc = new Scanner(System.in);

static void bono(){
    double bono, puntos, S_minimo;
    System.out.print("Ingresa el valor de puntos: ");
    puntos = sc.nextDouble();
    sc.nextLine();
    System.out.print("Ingresa el valor de salario minimo: ");
    S_minimo = sc.nextDouble();
    sc.nextLine();
    bono=0;
    if(puntos>=100&&puntos>200)
        bono=S_minimo*0.10;
    if(puntos>=201&&puntos<=300)
        bono=S_minimo*0.40;
    if(puntos>=301&&puntos<=400)
        bono=S_minimo*0.70;
    if(puntos>=401)
        bono=S_minimo*0.80;
    System.out.println("Valor de bono: " + bono);
}
