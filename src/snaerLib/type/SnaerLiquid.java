package snaerLib.type;

import arc.graphics.Color;
import mindustry.type.Liquid;
import snaerLib.core.SnaerStat;

public class SnaerLiquid extends Liquid{
    //** Radioactivity but for liquid :3 */
    public float liquidRadioactivity = 0f;
    //** New stat. Planning to use it with new game mechanic. */
    public float aggressiveness = 0f;

    public SnaerLiquid(String name){
        this(name, new Color(Color.black));
    }

    public SnaerLiquid(String name, Color color) {
        super(name, color);
    }

    @Override
    public void setStats(){
        //** Just adding all vanilla stats... */
        super.setStats();
        stats.addPercent(SnaerStat.aggressiveness, aggressiveness);
        stats.addPercent(SnaerStat.liquidRadioactivity, liquidRadioactivity);
    }
    }
