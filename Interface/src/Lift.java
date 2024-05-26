public class Lift implements IRuangan, IBergerak{
    public int maxCapacity;
    public int jmlOrang;
    public boolean isMoving;
    public int jmlLantai;
    public int posisi;

    public boolean dapatDibuka() {
        return !isMoving;
    }
    public int sisaKapasitas() {
        return maxCapacity - jmlOrang;
    }

    @Override
    public boolean canMove(String arah) {
        if (arah == "Naik"){
            if (posisi < jmlLantai){
                return true;
            }
        } else if (arah == "Turun") {
            if (posisi > 1){
                return true;
            }
        }
        return false;
    }
}
