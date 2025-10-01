public class EjercicioTres {
    
    public void respuestaEjercicioTres() {
        esPrimo esPrimo = new esPrimo();
        int[] rangoPrimo;
        rangoPrimo = esPrimo.esPrimoRango(100,300);
        for(int n:rangoPrimo){
            System.out.println(n);
        }
    }
}
