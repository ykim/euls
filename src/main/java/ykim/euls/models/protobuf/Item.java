package ykim.euls.models.protobuf;

import ykim.euls.models.transformers.IntegerToBoolean;

/**
 * Item - Represents DT_DOTA_Item
 */
public class Item extends Ability {

    public Item(skadistats.clarity.model.Entity e) {
        super(e);
    }


    public Float getPurchaseTime() {
        return getProperty(Float.class, "m_flPurchaseTime");
    }

    public Float getAssembledTime() {
        return getProperty(Float.class, "m_flAssembledTime");
    }

    public Integer getPurchaserHandle() {
        return getProperty(Integer.class, "m_hPurchaser");
    }

    public Boolean isCombinable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bCombinable"));
    }

    public Boolean isDroppable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bDroppable"));
    }

    public Boolean isShareAble() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_iSharability"));
    }

    public Boolean isChargeRequired() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bRequiresCharges"));
    }

    public Boolean isSellable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bSellable"));
    }

    public Boolean isStackable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bStackable"));
    }

    public Boolean isDisassemblable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bDisassemblable"));
    }

    public Boolean isKillable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bKillable"));
    }

    public Boolean isPermanent() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bPermanent"));
    }

    public Boolean isPurchasable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bPurchasable"));
    }

    public Boolean isRecipe() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bRecipe"));
    }


    public Integer getInitialCharges() {
        return getProperty(Integer.class, "m_iInitialCharges");
    }

    public Integer getCurrentCharges() {
        return getProperty(Integer.class, "m_iCurrentCharges");
    }
}
