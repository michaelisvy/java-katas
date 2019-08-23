package com.gildedrose;

public class Cheese extends Item {

    public Cheese(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        if (this.quality < 50) {
            this.increaseQuality();
        }
        if (this.sellIn < 0 && this.quality < 50) {
            this.increaseQuality();
        }

        this.decreaseSellIn();
    }
}
