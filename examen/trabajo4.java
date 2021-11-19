static void OPbasicas(){ 
  int resultado=0;
  System.out.println("INGRESE EL PRIMER NUMERO");
  int numero1=sc.nextInt();
  System.out.println("INGRESE EL SEGUNDO NUMERO");
  int numero2=sc.nextInt();
  System.out.println("OPERACIONES BASICAS");
  int operacion=sc.nextInt();
  switch(operacion){
     case 1: resultado=numero1+numero2;
     System.out.println("la suma es:"+resultado);
     break;
     case 2: resultado=numero1-numero2;
     System.out.println("la resta es:"+resultado);
     break;
     case 3: resultado=numero1*numero2;
     System.out.println("la multiplicacion es:"+resultado);
     break;
     case 4: resultado=numero1/numero2;
     System.out.println("la division es:"+resultado);
     break;
     default:
      System.out.println("LA OPERACION NO EXISTE");
      break;

   }


}
