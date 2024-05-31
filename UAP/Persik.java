class Persik extends Tanaman implements Perawatan{
    private double nilaiPerkembangan = 0.15;
    int berbuah = 250;
    static double proses = 0;
    static int buah =0;
        public Persik(int masaHidup, int berbuah, double perkembangan) {
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
            double nilai = getPerkembangan()*0.025;
           System.out.println("Perkembangan Tanaman : " + nilai);
        }
        
    }