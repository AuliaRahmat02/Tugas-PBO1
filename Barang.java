class Barang{
    String idProduct;
    String name;
    double price;

    Barang(String idProduk, String nama, double harga){
        this.idProduct = idProduk;
        this.name = nama;
        this.price = harga;
    }

    Barang(String idProduk, String nama){
        this.idProduct = idProduk;
        this.name = nama;
    }
    public void setNama(String nama) {
        this.name = nama;
    }
    public String getNama() {
        return name;
    }
    public void setHarga(double harga) {
        this.price = harga;
    }
    public double getHarga() {
        return price;
    }
    public String getIdProduk() {
        return idProduct;
    }
    public void print(){
        System.out.println(getIdProduk()+" | "+getNama()+" | "+getHarga());
    }
}

class Soal01{
    public static void main(String[] args) {
        Barang b1 = new Barang("BRG-001","Tas Gucci");
        b1.setHarga(1200);

        Barang b2 = new Barang("BRG-002","Printer Epson L355");
        b2.setHarga(200);

        b1.print();

        Barang b3 = new Barang("BRG-003","Koper",150);
        Barang b4 = new Barang("BRG-004","Helm",20);

        b3.print();
        b4.print();

        System.out.println(b1.getHarga()+b3.getHarga()+b4.getHarga());
    }
}