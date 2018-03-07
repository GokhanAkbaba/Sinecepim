package sinecep.cannet.sinecepiz;

/**
 * Created by cannet on 21.11.2017.
 */
public class Filmler {
    public  Filmler(){

    }
    public String film_adi;
    public String film_ing_adi;
    public String vizyon_tarihi;
    public String film_konu;
    public String film_yonetmen;
    public String film_oyuncular;
    public String film_sure;
    public String film_tur;
    public String film_resim;
    public String film_ulke;

    public Filmler(String film_adi,String film_ulke,String film_ing_adi,String vizyon_tarihi, String film_konu,String film_yonetmen,String film_oyuncular,String film_sure,String film_tur, String film_resim){
        setFilm_adi(film_adi);
        setFilm_ing_adi(film_ing_adi);
        setFilm_konu(film_konu);
        setFilm_konu(film_oyuncular);
        setFilm_resim(film_resim);
        setFilm_sure(film_sure);
        setFilm_tur(film_tur);
        setFilm_yonetmen(film_yonetmen);
        setFilm_ulke(film_ulke);
        setVizyon_tarihi(vizyon_tarihi);

    }

    public void setFilm_ulke(String film_ulke) {
        this.film_ulke = film_ulke;
    }

    public void setFilm_adi(String film_adi) {
        this.film_adi = film_adi;
    }

    public void setFilm_ing_adi(String film_ing_adi) {
        this.film_ing_adi = film_ing_adi;
    }

    public void setVizyon_tarihi(String vizyon_tarihi) {
        this.vizyon_tarihi = vizyon_tarihi;
    }

    public void setFilm_konu(String film_konu) {
        this.film_konu = film_konu;
    }

    public void setFilm_yonetmen(String film_yonetmen) {
        this.film_yonetmen = film_yonetmen;
    }

    public void setFilm_oyuncular(String film_oyuncular) {
        this.film_oyuncular = film_oyuncular;
    }

    public void setFilm_sure(String film_sure) {
        this.film_sure = film_sure;
    }

    public void setFilm_tur(String film_tur) {
        this.film_tur = film_tur;
    }

    public void setFilm_resim(String film_resim) {
        this.film_resim = film_resim;
    }

    public String getFilm_adi() {
        return film_adi;
    }

    public String getFilm_ulke() {
        return film_ulke;
    }

    public String getFilm_ing_adi() {
        return film_ing_adi;
    }

    public String getVizyon_tarihi() {
        return vizyon_tarihi;
    }

    public String getFilm_konu() {
        return film_konu;
    }

    public String getFilm_yonetmen() {
        return film_yonetmen;
    }

    public String getFilm_oyuncular() {
        return film_oyuncular;
    }

    public String getFilm_sure() {
        return film_sure;
    }

    public String getFilm_tur() {
        return film_tur;
    }

    public String getFilm_resim() {
        return film_resim;
    }


}
