/*
*CLase para las funciones logicas de una lavadora
*/
package Libreria;
/*
*
*©author Jesus
*/
public class LLFunciones {
   
    private int kilos = 0, llenadoCompleto = 0, tipo_ropa = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    public LLFunciones(int kilos,int tipo_ropa){
       this.kilos = kilos;
       this.tipo_ropa = tipo_ropa;
    }
    private void Llenado(){
       if(kilos <= 12){ //Llenado de Lavadora
         llenadoCompleto = 1;
           System.out.println("Llenando...");
           System.out.println("Llenado completo.");
       } else{
           System.out.println("La carga de ropa es muy pesada, reduce la carga");
       }
    }
    private void Lavado(){
      Llenado();
      if(llenadoCompleto == 1){
          if(tipo_ropa == 1){ //Lavado de ropa, decision de color
              System.out.println("Ropa blanca / Lavado suave");
              System.out.println("Lavando...");
              lavadoCompleto = 1;
          } else if(tipo_ropa == 2){
              System.out.println("Ropa de color / Lavado intenso");
              System.out.println("Lavando...");
              lavadoCompleto = 1;
          } else {
              System.out.println("El tipo de ropa no esta disponible");
              System.out.println("Se va a lavar como ropa de color / Lavado intenso");
              lavadoCompleto = 1;
          }
      }
    }
    private void Secado(){ //Secado
      Lavado();
      if(lavadoCompleto == 1){
          System.out.println("Secando...");
          secadoCompleto = 1;
      }
    }
    public void CicloFinalizado(){ //Clase lista para ser importada
      Secado();
      if(secadoCompleto == 1){
          System.out.println("Tu ropa ya esta lista!.");
      }
    }

    //Getter y Setter
    
    public int getRopa(){
      return tipo_ropa;
    }
    public void setRopa(int tipo_ropa){
      this.tipo_ropa = tipo_ropa;
    }
}
