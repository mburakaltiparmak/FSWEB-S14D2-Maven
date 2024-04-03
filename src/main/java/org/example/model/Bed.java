package org.example.model;



public class Bed {
    private String pillows;

    public int getStyle() {
        return style;
    }

    private int height;
    private int width;
    private int sheets;
    private int quilt;
    private int style;
    public Bed(String pillows,int style, int height, int width, int sheets) {
        this.pillows = pillows;
        this.height = height;
        this.width = width;
        this.sheets = sheets;

        this.style=style;
    }

    public String getPillows() {
        return pillows;
    }

    public void setPillows(String pillows) {
        this.pillows = pillows;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getQuilts() {
        return quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }
    public void makeCeyiz(){
        setPillows("Çift Kişilik");
        setQuilt(5);
        setSheets(5);
        System.out.println("Çeyizin hayırlı olsun.");

    }
    public void goToTailor(int height,int width){
        setHeight(height);
        setWidth(width);
        System.out.println("Size has been changed, width: " + getWidth() + "height : " + getHeight());

    }

}
