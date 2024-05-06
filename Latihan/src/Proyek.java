import java.lang.reflect.Method;
import java.util.Date;

public class Proyek {
    String nama;
    String deskripsi;
    Date tanggalMulai;
    Date tanggalSelesai;
    Status status;
    enum Status {
        DITUNDA, PROSES, SELESAI
    }
    Tugas tugas;
    SumberDaya sumberDaya;

    public void tambahTugas(Tugas tugas) {
        this.tugas = tugas;
    }
}
