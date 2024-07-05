public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.baixarCanal();
        smartTv.baixarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);
    }
}
