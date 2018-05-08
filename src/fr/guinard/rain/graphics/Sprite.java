package fr.guinard.rain.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles);
	public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x66adff);

	public static Sprite player0 = new Sprite(32, 0, 4, SpriteSheet.tiles);
	public static Sprite player1 = new Sprite(32, 3, 4, SpriteSheet.tiles);
	public static Sprite player2 = new Sprite(32, 2, 4, SpriteSheet.tiles);
	public static Sprite player3 = new Sprite(32, 1, 4, SpriteSheet.tiles);

	public static Sprite player01 = new Sprite(32, 0, 5, SpriteSheet.tiles);
	public static Sprite player02 = new Sprite(32, 0, 6, SpriteSheet.tiles);
	public static Sprite player03 = new Sprite(32, 0, 7, SpriteSheet.tiles);

	public static Sprite player11 = new Sprite(32, 3, 5, SpriteSheet.tiles);
	public static Sprite player12 = new Sprite(32, 3, 6, SpriteSheet.tiles);
	public static Sprite player13 = new Sprite(32, 3, 7, SpriteSheet.tiles);

	public static Sprite player21 = new Sprite(32, 2, 5, SpriteSheet.tiles);
	public static Sprite player22 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	public static Sprite player23 = new Sprite(32, 2, 7, SpriteSheet.tiles);

	public static Sprite player31 = new Sprite(32, 1, 5, SpriteSheet.tiles);
	public static Sprite player32 = new Sprite(32, 1, 6, SpriteSheet.tiles);
	public static Sprite player33 = new Sprite(32, 1, 7, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}

	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int color) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}

}
