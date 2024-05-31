abstract class Tanaman{
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    abstract void berkembang();
   
    public Tanaman(int masaHidup, int berbuah, double perkembangan){
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
    }
    public String status(){
        if (lamaHidup>=masaHidup){
            return "Mati";
        }else
            return "Hidup";
    }
    public String getStatus(){
        return status();
    }
    public String toString(){
        return "-----------------------------------------"+
               "\nMasa Hidup tanaman   : " + getMasaHidup() +
               "\nLama Hidup tanaman   : " + getLamaHidup() +
               "\nBuah yang dihasilkan : " + getBuah() +
               "\nStatus tanaman       : " + getStatus();
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
    
}