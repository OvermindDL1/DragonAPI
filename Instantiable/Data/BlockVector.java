package Reika.DragonAPI.Instantiable.Data;

import net.minecraftforge.common.util.ForgeDirection;

public class BlockVector {

	public final int xCoord;
	public final int yCoord;
	public final int zCoord;
	public final ForgeDirection direction;

	public BlockVector(int x, int y, int z, ForgeDirection dir) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
		direction = dir;
	}

}
