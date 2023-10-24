package com.example.lab1;

import java.io.Serializable;

public class Flower implements Serializable {
    private int mainFlower,wrapper,ribbon,card,mainFlowerCost,wrapperCost,ribbonCost,cardCost;

    public int getMainFlower() {
        return mainFlower;
    }

    public int getWrapper() {
        return wrapper;
    }

    public int getAllCost() {
        return mainFlowerCost+wrapperCost+ribbonCost+cardCost;
    }

    public int getRibbon() {
        return ribbon;
    }

    public int getCard() {
        return card;
    }

    public void setMainFlower(int mainFlower,int cost) {
        this.mainFlower = mainFlower;
        this.mainFlowerCost=cost;
    }

    public void setWrapper(int wrapper,int cost) {
        this.wrapper = wrapper;
        this.wrapperCost = cost;
    }

    public void setRibbon(int ribbon,int cost) {
        this.ribbon = ribbon;
        this.ribbonCost = cost;
    }

    public void setCard(int card,int cost) {
        this.card = card;
        this.cardCost = cost;
    }
}
