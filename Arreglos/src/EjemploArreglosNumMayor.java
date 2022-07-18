public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        
        
        int[] arr = {1,5,4,6,3,2,8,9,10};

        System.out.println("maxValue(arr) = " + maxValue(arr));
        
    }
    
    public static int maxValue(int[] arreglo){
        int max = arreglo[0];
        for(int i = 0 ; i < arreglo.length ; i++){
            if (max < arreglo[i]){
                max = arreglo[i];
            }
        }
        return max;
    }
}
