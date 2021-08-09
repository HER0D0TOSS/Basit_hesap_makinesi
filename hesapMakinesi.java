public class hesapMakinesi {

    public int toplama(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int bolme(int sayi1, int sayi2) {
        if (sayi1 > sayi2) {
            return sayi1 / sayi2;
        } else if (sayi2 > sayi1) {
            return sayi2 / sayi1;
        }
        return sayi1;
    }

    public int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
}



