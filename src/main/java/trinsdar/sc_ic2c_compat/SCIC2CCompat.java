package trinsdar.sc_ic2c_compat;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = SCIC2CCompat.MOD_ID, name = SCIC2CCompat.MOD_NAME, version = SCIC2CCompat.VERSION, dependencies = SCIC2CCompat.DEPENDS)
public class SCIC2CCompat {
    public static final String MOD_ID = "sc_ic2c_compat";
    public static final String MOD_NAME = "SC IC2C Compat";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDS = "required-after:ic2;required-after:ic2-classic-spmod;required-after:stevescarts;";
}
