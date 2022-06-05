package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.*;

import java.awt.*;

public class ss$ay
        extends zi {
    @de(vi = 0)
    public iv i = new iv("General");
    @au(wd = "orientation", vu = "Orientation", pr = "vertical", yp = @de(vi = 1))
    public ay kA;
    @au(wd = "coordinatesColor", vu = "Color", yp = @de(vi = 2))
    public gp kB;
    @au(wd = "directionDetails", vu = "Direction Details", pr = "true", yp = @de(vi = 3))
    public boolean kC;
    @au(wd = "yCoordinate", vu = "Y Coordinate", pr = "true", yp = @de(vi = 4))
    public boolean kD;
    @au(wd = "textShadow", vu = "Text Shadow", pr = "false", yp = @de(vi = 5))
    public boolean ki;
    @fl(yp = @de(vi = 10))
    @cy(dz = 1.0, ev = 28.0)
    public ci iO;
    @de(vi = 20)
    public iv kE = new iv("Background");
    @au(wd = "background", vu = "Background", pr = "true", yp = @de(vi = 21))
    public boolean bg;
    @au(wd = "backgroundColor", vu = "Color", pr = "7/7/7/146", nu = @ra(wd = "background"), yp = @de(vi = 22))
    public Color kv;
    @de(vi = 30)
    public iv kF = new iv("Biome");
    @au(wd = "biome", vu = "Biome", pr = "true", yp = @de(vi = 31))
    public boolean kG;
    @au(wd = "biomeColor", vu = "Color", nu = @ra(wd = "biome"), yp = @de(vi = 32))
    public gp kH;
    @de(vi = 40)
    public iv kI = new iv("Chunk Counter");
    @au(wd = "chunkCounter", vu = "Chunk Counter", pr = "true", yp = @de(vi = 41))
    public boolean kJ;
    @au(wd = "chunkCounterColor", vu = "Color", nu = @ra(wd = "chunkCounter"), yp = @de(vi = 42))
    public gp kK;
    @de(vi = 50)
    public iv kL = new iv("Directions");
    @au(wd = "directions", vu = "Directions", pr = "true", yp = @de(vi = 51))
    public boolean kM;
    @au(wd = "directionsColor", vu = "Color", pr = "false/0/255/255", nu = @ra(wd = "directions"), yp = @de(vi = 52))
    public gp kN;

    public enum ay {
        HORIZONTAL,
        VERTICAL

    }
}
