package com.t10a.betterwithmods;

import com.t10a.betterwithmods.proxy.ICommonProxy;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid=BWAReference.MOD_ID, name=BWAReference.NAME, version = BWAReference.VERSION, acceptedMinecraftVersions = BWAReference.ACCEPTED_VERSION)
public class BetterWithAdditions
{
    @Mod.Instance
    public static BetterWithAdditions instance;

    @SidedProxy(clientSide = BWAReference.CLIENT_PROXY_CLASS, serverSide = BWAReference.SERVER_PROXY_CLASS)
    public static ICommonProxy proxy;

    public static final Logger log = LogManager.getLogger(BWAReference.MOD_ID);

    public BetterWithAdditions() {
        if (Loader.isModLoaded("betterwithmods"))
        {
            log.info("Hey Better with Mods! What devious plans do we have today with the wolf and the-");
            LogManager.getLogger("betterwithmods").info("Umm... I don't know you, Better with Additions.");
        }
        if (Loader.isModLoaded("tconstruct"))
        {
            LogManager.getLogger("tconstruct").info("HEY! What's the big idea, writing silly things to the log like me?");
        }
        else if(!Loader.isModLoaded("betterwithmods"))
        {
            log.info("We may have a problem. I can't find my friend Better With Mods!");
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        log.info("Better With Additions has reached pre-initialisation.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        log.info("Better With Additions has reached initialisation.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        log.info("Better With Additions has reached post-initialisation.");
    }
}