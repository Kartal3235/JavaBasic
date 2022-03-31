package practice_basic_day05;

public class Constructor_ThisKeyword {
    /*
	 1) Constructor'lar main method'un disinda, class'in icinde olusturulur
	 2) Constructor'in ismi class ismi ile ayni olmalidir
	 3) Method ile Constructor Farki: a) Method ismi class isminden farkli olabilir
	                                     fakat Constructor ismi class ismi ile ayni olmalidir.
	                                  b) Method'larda return type olmak zorundadir ama
	                                     Constructor'larda return type olmaz. Constructor'a return
	                                     type eklerseniz artik o constructor degil method'dur.
	 4) Bir class'da birden fazla constructor olabilir. Ama constructor'larin parametreleri farkli olmalidir.
	    Yani; farkli constructor uretmek icin overloading kurallarini kullanmaliyiz.

	    Parametresiz bir constructor ile object uretirsek objenin degerleri instance veya static
        olarak olusturulan variable’larin ilk degerlerine esit olur. Eger biz objenin degerlerini
        degistirmek istersek tum variable’lar icin deger atamasi yapmam gerekir

        Object uretirken degerleri de kendimiz vermek istersek parametreli constructor kullanmamiz
        gerekir. Parametreli constructor olusturmak objeye bizim verdigimiz argument’leri atamak
        icin yeterli degildir. Argumentleri objeye atayabilmek icin constructor body’si icinde
        this.instanceVarIsmi = parametreIsmi; seklinde deger atamasi yapmam gerekir.
        NOT : this ile deger atamasi yapilmayan parametreler icin hic bir islem yapilmaz
	 */

    /*
     * Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed
     */
    public class BookClass {
        String adi, yazari;
        int yayinYili;
        // class da body icinde sag click->
        // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
        public BookClass(String adi, String yazari, int yayinYili) {
            this.adi = adi;
            this.yazari = yazari;
            this.yayinYili = yayinYili;
        }
        public BookClass(String adi, String yazari) {
            this.adi = adi;
            this.yazari = yazari;
        }
        public void display(){
            System.out.println("Kitap:" +adi + " Yazar :" +yazari + " yayin yili:" +yayinYili);
        }
        public void main(String[] args) {
            BookClass kitap1 = new BookClass("Harry Potter and The Goblet of Fire","JK Rowling",2000);
            BookClass kitap2 = new BookClass("Crime and Punishment","Dostoyevsky");
            kitap1.display();
            kitap2.display();
        }
    }


}
