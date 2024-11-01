public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? : " + smartTv.canal);
        System.out.println("Volume Atual? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smartTv.ligada);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual? : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
    }
}
