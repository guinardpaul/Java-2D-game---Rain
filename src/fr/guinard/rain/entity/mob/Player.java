/**
 * 
 */
package fr.guinard.rain.entity.mob;

import fr.guinard.rain.graphics.Screen;
import fr.guinard.rain.graphics.Sprite;
import fr.guinard.rain.input.Keyboard;

/**
 * @author Paul
 *
 */
public class Player extends Mob {

	private Keyboard input;
	private int anim = 0;
	private boolean walking = false;

	public Player(Keyboard input) {
		this.input = input;
		sprite = Sprite.player0;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		sprite = Sprite.player0;
	}

	public void update() {
		int xa = 0, ya = 0;

		if (anim < 9000) {
			anim++;
		} else {
			anim = 0;
		}

		if (input.up) {
			ya--;
		}
		if (input.down) {
			ya++;
		}
		if (input.left) {
			xa--;
		}
		if (input.right) {
			xa++;
		}

		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
	}

	public void render(Screen screen) {
		if (dir == 0) {
			sprite = Sprite.player0;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.player01;
				} else {
					sprite = Sprite.player02;
				}
			}
		}
		if (dir == 1) {
			sprite = Sprite.player1;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.player11;
				} else {
					sprite = Sprite.player12;
				}
			}
		}
		if (dir == 2) {
			sprite = Sprite.player2;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.player21;
				} else {
					sprite = Sprite.player22;
				}
			}
		}
		if (dir == 3) {
			sprite = Sprite.player3;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.player31;
				} else {
					sprite = Sprite.player32;
				}
			}
		}

		screen.renderPlayer(x - 16, y - 16, sprite);

	}

}
