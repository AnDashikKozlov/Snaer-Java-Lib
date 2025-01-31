package snaerLib;

import arc.util.*;
import mindustry.mod.*;

public class SnaerJavaLibMod extends Mod{

    public SnaerJavaLibMod(){
        ClassMap.classes.put("SnaerLiquid", snaerLib.type.SnaerLiquid.class);
    }

    @Override
    public void loadContent(){
        Log.info("Loading some java classes.");
    }

}
