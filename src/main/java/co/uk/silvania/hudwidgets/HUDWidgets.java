package co.uk.silvania.hudwidgets;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import co.uk.silvania.hudwidgets.client.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid=HUDWidgets.modid, name="HUDWidgets", version="0.7", guiFactory="co.uk.silvania.hudwidgets.client.ConfigEditor")
//@NetworkMod(clientSideRequired=false, serverSideRequired=false)
public class HUDWidgets {
	
	public static final String modid = "hudwidgets";
	public static String configPath;
	
    @Instance(HUDWidgets.modid)
    public static HUDWidgets instance;
	
    @SidedProxy(clientSide="co.uk.silvania.hudwidgets.client.ClientProxy", serverSide="co.uk.silvania.hudwidgets.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	configPath = event.getModConfigurationDirectory() + "/";
    	HUDWidgetsConfig.init(configPath);
    	GuiWidgetHealth.defaultResolution();
    	//proxy.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(instance);
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
    	System.out.println("Config is changed!");
    	if(eventArgs.modID.equals(modid))
    		HUDWidgetsConfig.syncConfig();
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event) {
    	enableGuiStuff();
    }
    
    @SideOnly(Side.CLIENT)
    public void enableGuiStuff() {
    	if (!Minecraft.getMinecraft().gameSettings.showDebugInfo) {
    		MinecraftForge.EVENT_BUS.register(new GuiWidgetBase(Minecraft.getMinecraft()));
	    	
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetArmour(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetCompass(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetExp(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetGamemode(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetHealth(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetHorseHealth(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetHorseJump(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetHotbar(Minecraft.getMinecraft())); //TODO 1
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetHunger(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetName(Minecraft.getMinecraft()));
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetOxygen(Minecraft.getMinecraft()));
	    	//MinecraftForge.EVENT_BUS.register(new GuiWidgetPotionDock(Minecraft.getMinecraft())); //TODO 2
	    	MinecraftForge.EVENT_BUS.register(new GuiWidgetTime(Minecraft.getMinecraft()));
	    	//MinecraftForge.EVENT_BUS.register(new GuiWidgetFPS(Minecraft.getMinecraft()));
	    	//if (Loader.isModLoaded("flenixcities") || (Loader.isModLoaded("mceconomy2"))) {
	    	//	System.out.println("FlenixCities and/or MCEconomy2 detected; allowing Wallet widget!");
	    	//	MinecraftForge.EVENT_BUS.register(new GuiWidgetWallet(mc.getMinecraft())); //TODO 2
	    	//}
	    	//Notifications
	    	//MOTD
	    	//TODO Boss Health Bar, maybe a target health bar too.
    	} else {
    		System.out.println("Showing Debug Screen!");
    	}
    }

}
