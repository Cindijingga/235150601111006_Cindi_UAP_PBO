class Tomat extends Tanaman implements Perawatan{
    private double nilaiPerkembangan = 0.25;
    int berbuah = 100;
    static double proses = 0;
    static int buah =0;
    
        public Tomat(int masaHidup, int berbuah, double perkembangan) {
            super(masaHidup, berbuah, perkembangan);
        }
    
        @Override
        void berkembang() {
           if (getProsesBerbuah()== this.berbuah){
             buah = +1;
             setProsesBerbuah(0);
           } if (getProsesBerbuah()> this.berbuah){
               buah = +1;
               getProsesBerbuah();
               setProsesBerbuah(getProsesBerbuah()-this.berbuah);
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
          double nilai = getPerkembangan()*0.05;
           System.out.println("Perkembangan Tanaman : " + nilai);
        }
            public String toString(){
            return "-----------------------------------------"+
                   "\nMasa Hidup tanaman   : " + getMasaHidup() +
                   "\nLama Hidup tanaman   : " + getLamaHidup()+
                   "\nBuah yang dihasilkan : " + buah +
                   "\nStatus tanaman       : " + getStatus();
        }
    }