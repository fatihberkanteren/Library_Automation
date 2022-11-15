
public class Kıtaplar {

    public Kıtaplar(int ID, String KITAPAD, String YAZAR, int SAYFA, String YAYIN, String DURUMU) {
        this.ID = ID;
        this.KITAPAD = KITAPAD;
        this.YAZAR = YAZAR;
        this.SAYFA = SAYFA;
        this.YAYIN = YAYIN;
        this.DURUMU = DURUMU;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getKITAPAD() {
        return KITAPAD;
    }

    public void setKITAPAD(String KITAPAD) {
        this.KITAPAD = KITAPAD;
    }

    public String getYAZAR() {
        return YAZAR;
    }

    public void setYAZAR(String YAZAR) {
        this.YAZAR = YAZAR;
    }

    public int getSAYFA() {
        return SAYFA;
    }

    public void setSAYFA(int SAYFA) {
        this.SAYFA = SAYFA;
    }

    public String getYAYIN() {
        return YAYIN;
    }

    public void setYAYIN(String YAYIN) {
        this.YAYIN = YAYIN;
    }

    public String getDURUMU() {
        return DURUMU;
    }

    public void setDURUMU(String DURUMU) {
        this.DURUMU = DURUMU;
    }

    private int ID;
    private String KITAPAD;
    private String YAZAR;
    private int SAYFA;
    private String YAYIN;
    private String DURUMU;
    

}
