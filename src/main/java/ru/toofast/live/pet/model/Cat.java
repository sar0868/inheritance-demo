package ru.toofast.live.pet.model;

public class Cat extends Animal {

    private String furColor;
    private CatType type;
    private boolean certified;

    public Cat(String name, String furColor, CatType type, boolean certified) {
        super(name);
        this.furColor = furColor;
        this.type = type;
        this.certified = certified;
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    public CatType getType() {
        return type;
    }
}
