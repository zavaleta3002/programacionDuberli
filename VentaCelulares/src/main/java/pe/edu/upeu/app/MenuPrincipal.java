package pe.edu.upeu.app;


import pe.edu.upeu.dao.MarcaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentasDao;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class MenuPrincipal {
    LeerTeclado leer=new LeerTeclado();
    UsuarioDao userDao;
    MarcaDao marDao;
    ProductoDao proDao;
    VentasDao ventasDao;
    UtilsX util=new UtilsX();

    public void mainLogin() {
        util.clearConsole();
        System.out.println("********************** System Autenticate *********************");//color
        System.out.println();
        userDao=new UsuarioDao();
        if(userDao.login()){
            menuMain();
        }else{            
            System.out.println("Intente Nuevamemnte");//color
            mainLogin();
        }
    }

    public void menuMain() {
        int opcion=0;
        System.out.println("================ Bienvenidos al Sistema ============");//color
        String msg="Seleccione una opciÃ³n"+
        "\n11 = Nuevo Usuario"    
        +"\n12 = Listar Usuario"
        +"\n31 = Crear Marca"    
        +"\n41 = Crear Producto"    
        +"\n42 = Listar Producto"    
        +"\n43 = Actualizar Producto"
        +"\n44 = Eliminar Producto"
        +"\n50 = Registrar Ventas"
        +"\n51 = Reporte Venta";//color 
        opcion=leer.leer(0,msg);
        while(opcion!=0){
            switch(opcion){
                case 11:{ 
                    userDao=new UsuarioDao();
                    userDao.registrarNuevoUsuario();
                } break;
                case 12:{
                    userDao=new UsuarioDao();
                    userDao.listarUsuarios();
                } break;  
                case 31:{
                    marDao=new MarcaDao();
                    marDao.createMarca();
                } break;                  
                case 41:{
                    proDao=new ProductoDao();
                    proDao.createProducto();
                } break;                 
                case 42:{
                    proDao=new ProductoDao();
                    proDao.reportProducto();
                } break;                 
                case 43:{
                    proDao=new ProductoDao();
                    proDao.updateProducto();
                } break;                 
                case 44:{
                    proDao=new ProductoDao();
                    proDao.deleteProducto();
                } break;  
                case 50:{
                    ventasDao=new VentasDao();
                    ventasDao.registroVenta();
                } break;
                case 51:{
                    ventasDao=new VentasDao();
                    ventasDao.ReporteVentasRangoFecha();
                } break;                                                           
                default: System.out.println("Opcion no existe!");//color
            }        
          opcion=leer.leer(0,msg);
        }        
    }

}