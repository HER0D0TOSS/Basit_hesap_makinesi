public class Main {

    public static void main(String[] args) {

        hesapMakinesi HesapMakinesi = new hesapMakinesi();

        int sonuc_toplama = HesapMakinesi.toplama(3,4);
        int sonuc_cikarma = HesapMakinesi.cikarma(6,7);
        int sonuc_bolme = HesapMakinesi.bolme( 9,3);
        int sonuc_carpma = HesapMakinesi.carpma(9,5);

        System.out.println(sonuc_toplama);
        System.out.println(sonuc_cikarma);
        System.out.println(sonuc_bolme);
        System.out.println(sonuc_carpma);
    }
}
