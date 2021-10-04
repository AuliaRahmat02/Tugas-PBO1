class Book{
    String judul;
    String pengarang;
    double harga;

    Book(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public double getHarga() {
        return harga;
    }
    public void print(){
        System.out.println(getJudul()+" | "+getPengarang()+" | "+getHarga());
    }
}

class Soal02 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter","J.K. Rowling",300000);
        Book b2 = new Book("UML","Ivar Jacobson",400000);
        b1.print();
        b2.print();
    }
}
