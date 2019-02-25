package com.company;

public class MesinKopi {
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;

    public void setJenisKopi(String JenisKopi){
        this.JenisKopi = JenisKopi;
    }

    public String getJenisKopi(){
        return this.JenisKopi;
    }

    public void setJumlahStokKopi(int JumlahStokKopi){
        this.JumlahStokKopi = JumlahStokKopi;
    }

    public int getJumlahStokKopi(){
        return this.JumlahStokKopi;
    }

    public void setTopping(String Topping){
        this.Topping = Topping;
    }

    public String getTopping(){
        return this.Topping;
    }
}
