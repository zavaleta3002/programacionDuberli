static void Nota(){ 
    
    double nota1=0, nota2=0, nota3=0;
    double promedio=0;
    
System.out.println("ingrese las notas del estudiante: ");
    
System.out.print("ingrese la nota 1: ");
nota1 = sc.nextDouble();
System.out.print("ingrese la nota 2: ");
nota2 = sc.nextDouble();
System.out.print("ingrese la nota 3: ");
nota3 = sc.nextDouble();
    
  promedio = (nota1 * 0.30 + nota2 * 0.30 + nota3 * 0.40)/3;
    if(promedio >=11){
      System.out.println("el alumno aprovo: " + promedio); 
    }else {
      System.out.println("el alumno reprovo: " + promedio); 
    }
}
