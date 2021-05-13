
package netflix;

  
public class Arama {
    private String program_ad;
    private String tur;
    public Arama(String program_ad, String tur) {
        this.program_ad=program_ad;
        this.tur=tur;
       
    }

    /**
     * @return the isim
     */
    
    /**
     * @return the tur
     */
    public String getTur() {
        return tur;
    }

    /**
     * @return the program_ad
     */
    public String getProgram_ad() {
        return program_ad;
    }
}
