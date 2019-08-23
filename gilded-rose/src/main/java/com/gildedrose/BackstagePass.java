package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            this.increaseQuality();

            if (this.sellIn < 11) {
                this.increaseQuality();
            }
            if (this.sellIn < 6) {
                this.increaseQuality();
            }
        }
        decreaseSellIn();

        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }


}
