public class Mobil implements IBergerak{
    public int jmlKursi;
    public boolean isLocked;
    public int jmlPenumpang;
    public boolean isMoving;
    public String gear;
    public boolean isBraked;

    public boolean dapatDibuka(){
        if (!isLocked && !isMoving){
            return true;
        }
        return false;
    }

    public int sisaKapasitas(){
        return jmlKursi - jmlPenumpang;
    }

    @Override
    public boolean canMove(String arah) {
        if (!isBraked){
            if (arah == "Mundur" && gear == "R") {
                return true;
            } else if (arah == "Mundur" && gear == "R") {
                return true;
            }
        }
        return false;
    }
}
