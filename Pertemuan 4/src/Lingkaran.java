class Lingkaran {
    // Atribut jari-jari lingkaran
    double jariJari;

    // Konstruktor untuk inisialisasi objek Lingkaran dengan jari-jari tertentu
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}