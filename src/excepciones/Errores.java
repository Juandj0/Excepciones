/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class Errores {
  public Errores(){
 divideByZero();
mb(-1);
  }
  double divideByZero(){
  double result=0;
  
  try{
      result= 25/0;
  }catch(ArithmeticException exception){
  System.out.println("Error aritmetico, no es posible por cero ");
  }  
  
  

  return result;
  
  }
  void ma(){
      int x=0;
      try{
          for(int i=0;i<10;i++){
          x=i/0;
//          catch(ArithmeticException exception){
//                  System.out.println("Error aritmetico, no es posible por cero ");
                  }
          
          }catch(ArithmeticException exception){
                  System.out.println("Error aritmetico, no es posible por cero ");
                  }
      
      
      }
    void mb(int y){
        try{
     if(y<0){
     throw new Juan("Errorsiño") ;
                  }
else{
    System.out.println(y);
     }
        }catch(Juan juan){
            
        System.out.println("Ahora si funciona ");
        }   
      
      }
      
  }
    
