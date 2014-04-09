package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.models.transformers.IntegerToBoolean;

/**
 * Item - Represents DT_DOTA_Item
 */
public interface Item extends Ability {

    @DotAProperty(type = Float.class, propertyName = "m_flPurchaseTime")
    public Float getPurchaseTime();

    @DotAProperty(type = Float.class, propertyName = "m_flAssembledTime")
    public Float getAssembledTime();

    @DotAProperty(type = Integer.class, propertyName = "m_hPurchaser")
    public Integer getPurchaserHandle();

    @DotAProperty(type = Integer.class, propertyName = "m_bCombinable", transformer = IntegerToBoolean.class)
    public Boolean isCombinable();

    @DotAProperty(type = Integer.class, propertyName = "m_bDroppable", transformer = IntegerToBoolean.class)
    public Boolean isDroppable();

    @DotAProperty(type = Integer.class, propertyName = "m_iSharability", transformer = IntegerToBoolean.class)
    public Boolean isShareAble();

    @DotAProperty(type = Integer.class, propertyName = "m_bRequiresCharges", transformer = IntegerToBoolean.class)
    public Boolean isChargeRequired();

    @DotAProperty(type = Integer.class, propertyName = "m_bSellable", transformer = IntegerToBoolean.class)
    public Boolean isSellable();

    @DotAProperty(type = Integer.class, propertyName = "m_bStackable", transformer = IntegerToBoolean.class)
    public Boolean isStackable();

    @DotAProperty(type = Integer.class, propertyName = "m_bDisassemblable", transformer = IntegerToBoolean.class)
    public Boolean isDisassemblable();

    @DotAProperty(type = Integer.class, propertyName = "m_bKillable", transformer = IntegerToBoolean.class)
    public Boolean isKillable();

    @DotAProperty(type = Integer.class, propertyName = "m_bPermanent", transformer = IntegerToBoolean.class)
    public Boolean isPermanent();

    @DotAProperty(type = Integer.class, propertyName = "m_bPurchasable", transformer = IntegerToBoolean.class)
    public Boolean isPurchasable();

    @DotAProperty(type = Integer.class, propertyName = "m_bRecipe", transformer = IntegerToBoolean.class)
    public Boolean isRecipe();

    @DotAProperty(type = Integer.class, propertyName = "m_iInitialCharges")
    public Integer getInitialCharges();

    @DotAProperty(type = Integer.class, propertyName = "m_iCurrentCharges")
    public Integer getCurrentCharges();
}
