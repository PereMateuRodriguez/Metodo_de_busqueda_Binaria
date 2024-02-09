public class Main {
    public static int busqueda(int[] array, int numero ){
        int centro;
        int inf = 0;
        int sup = array.length -1;
        while (inf <= sup){
            centro = (inf + sup) /2;
            if (array[centro] == numero){
                return centro;
            }
            else if (numero < array[centro]){
                sup = centro - 1;
            }
            else{
                inf = centro +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,6,8,10};
        int numero = 1;

        int a = busqueda(array, numero);
       System.out.println(a);
    }
}
