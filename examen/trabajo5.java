static void menuOpciones(){ 
    int opcionesA=0;
    String msg="\n   *** ";
    System.out.println(msg);
    String msg1= "*** (1)";
    System.out.println(msg1);
    String msg2= "*** (2)";
    System.out.println(msg2);
    String msg3= "*** (3)";
    System.out.println(msg3);
    String msg4= "***  (4)"; 
    System.out.println(msg4);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1:bono();break;
          case 2:Nota();break;
          case 3:Vacuna();break;
          case 4:OPbasicas();break;
        
          default:
          System.out.println("El Algoritmo no existe!");
        }
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }       


    public static void main(String[] args) {
    menuOpciones();
  }
}