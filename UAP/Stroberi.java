class Stroberi extends Tanaman implements Perawatan{
    private double nilaiPerkembangan = 0.35;
    int berbuah = 150;
    static double proses = 0;
    static int buah =0;
    
        public Stroberi(int masaHidup, int berbuah, double perkembangan) {
            super(masaHidup, berbuah, perkembangan);
        }
        @Override
        void berkembang() {
           if (getProsesBerbuah()== berbuah){
               buah = +1;
               setProsesBerbuah(0);
           } if (getProsesBerbuah()> berbuah){
               buah = +1;
               getProsesBerbuah();
               setProsesBerbuah(getProsesBerbuah()-berbuah);
           }
        }
       public double setProsesBerbuah(int nilaiPerkmbangan){
           proses = nilaiPerkembangan * berbuah;
           return proses;
        }
      public double getProsesBerbuah(){
            return proses;
        }
        @Override
        public void treatment() {
           System.out.println("Perkembangan Tanaman : " + (getPerkembangan()*0.05));
        }
            public String toString(){
            return "-----------------------------------------"+
                   "\nMasa Hidup tanaman   : " + getMasaHidup() +
                   "\nLama Hidup tanaman   : " + getLamaHidup()+
                   "\nBuah yang dihasilkan : " + buah +
                   "\nStatus tanaman       : " + getStatus();
        }
    }
    