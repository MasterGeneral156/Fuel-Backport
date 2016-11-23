package com.themastergeneral.fuelbackport;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.fuelbackport.FuelHandler;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main 
{
    public static final String MODID = "fuelbackport";
    public static final String MODNAME = "Fuel Backport";
    public static final String VERSION = "1.0";
    
    @Instance
    public static Main instance = new Main();
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("Fuel Backport is loading...");
    	GameRegistry.registerFuelHandler(new FuelHandler());
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	System.out.println("Fuel Backport is loaded.");
    }
}
