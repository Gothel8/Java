package Enum2;

enum Hayvanlar{
    Kedi("miyav",15),
    Kopek("hav",10),
    Yilan("tıss",8);

    private final String ses;
    private final int yas;

    Hayvanlar(String ses,int yas){
        this.ses = ses;
        this.yas = yas;
    }

    String getSes(){
        return ses;
    }

    int getYas(){
        return yas;
    }

    @Override
    public String toString() {
        return name() + " - Çıkardığı ses: " + ses + " - Ortalama yaş: "+ yas;
    }

}