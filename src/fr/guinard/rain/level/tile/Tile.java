package fr.guinard.rain.level.tile;

import fr.guinard.rain.graphics.Screen;
import fr.guinard.rain.graphics.Sprite;

public class Tile {

	public int x;
	public int y;
	public Sprite sprite;

	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);

	public Tile(Sprite sprite) {
		super();
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {

	}

	public boolean solid() {
		return false;
	}

}
