package com.company;

public class Topping {
    private String JenisTopping;
    private int JumlahStokTopping;

    public void setJenisTopping(String JenisTopping){
        this.JenisTopping = JenisTopping;
    }

    public void setJumlahStokKopi(int JumlahStokTopping){
        this.JumlahStokTopping = JumlahStokTopping;
    }

    public String getJenisTopping(){
        return JenisTopping;
    }

    public int getJumlahStokTopping(){
        return JumlahStokTopping;
    }
}
