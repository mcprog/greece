package com.mcprog.greece.proxy;

/**
 * 
 * @author mcprog
 *
 */
public interface IProxy {
	public abstract void registerTileEntities();

    public abstract void initRenderingAndTextures();

    public abstract void registerEventHandlers();

    public abstract void registerKeybindings();
}
