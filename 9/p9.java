interface Compute {
    long  convert(long  v);
}

class GBtoB implements Compute{
    public long  convert(long  v){
        return v*1024*1024*1024;
    }
}

class EtoR implements Compute{
    public long  convert(long  v){
        return v*107;
    }
}
public class p9 {
    public static void main(String[] args) {
        Compute c1 = new GBtoB();
        Compute c2 = new EtoR();
        System.out.println("2 GB = " + c1.convert(2)+ " bytes");
        System.out.println("10 Euros = " + c2.convert(10)+ " rupees");
    }
    
    
}
