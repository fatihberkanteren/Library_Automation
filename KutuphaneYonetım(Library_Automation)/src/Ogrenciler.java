
public class Ogrenciler {

    public Ogrenciler(int ID, String TC, String AD, String SOYAD, String ALINANKITAP, String ALINANTARIH) {
        this.ID = ID;
        this.TC = TC;
        this.AD = AD;
        this.SOYAD = SOYAD;
        this.ALINANKITAP = ALINANKITAP;
        this.ALINANTARIH = ALINANTARIH;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getAD() {
        return AD;
    }

    public void setAD(String AD) {
        this.AD = AD;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public void setSOYAD(String SOYAD) {
        this.SOYAD = SOYAD;
    }

    public String getALINANKITAP() {
        return ALINANKITAP;
    }

    public void setALINANKITAP(String ALINANKITAP) {
        this.ALINANKITAP = ALINANKITAP;
    }

    public String getALINANTARIH() {
        return ALINANTARIH;
    }

    public void setALINANTARIH(String ALINANTARIH) {
        this.ALINANTARIH = ALINANTARIH;
    }
   
    private int ID;
    private String TC;
    private String AD;
    private String SOYAD;
    private String ALINANKITAP;
    private String ALINANTARIH;

}
