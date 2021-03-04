package gps;
/**
 * Bicicleta class
 * 
 * @author Rafael Garcia Diaz
 * @version
 */

public class Bicicleta {
	
	/**
	 * clase Bicicleta
	 */
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    
    /**
     * 
     * @param camino1
     * @param camino2
     * @param camino3
     * @return devuelve el camino mas corto
     */
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        // separamos los arrays para que se recorran de manera separada y asi
        //poder realizar el calculo correcto
        for(int i=0; i<camino1.length; i++){
            sum1 += camino1[i];
        }
        
        for(int i=0; i<camino2.length; i++) {
        	sum2 += camino2[i];
        }
        
        for(int i=0; i<camino3.length; i++) {
        	sum3 += camino3[i];
        }
        
        if(sum1 < sum2 && sum1 < sum3){
            return "camino 1"; 
            
        }else if(sum2 < sum3 && sum2 < sum1){
            return "camino 2";
            
        }else if(sum3 < sum1 && sum3 < sum2){
            return "camino 3";
            
        }else{
        	
            if(sum1 == sum2 && sum2 == sum3){
                return "camino 1, 2 y 3";
                
            }else if(sum1 == sum3){
                return "caminos 1 y 3";
                
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
                
            }else{
                return "caminos 1 y 2";
            }
        }
    }
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

