package calaander;
//Bahir Dar Institute Of Technology
//Wusdom at the Source of The Blue Nile
public final class Eotc {

    public Eotc(int zemene_hadis) {
        this.zemene_hadis = zemene_hadis;
        this.wongelawi();
    }
    int zemene_hadis;
    public final int zemene_orit = 5500;
    int ameteAlem;
    String[] wengelawi = {"Yohannes", "Matewos", "Markos", "Lukas"};
    int meteneRabiet;
public String wongelawi() {
        ameteAlem = zemene_orit + zemene_hadis;//amete alem is the sum of orit and hadis
        meteneRabiet = ameteAlem / 4;
        int w = ameteAlem % 4;//we take 4 because the number of wongelawian is 4      
        return wengelawi[w];
    }

   }