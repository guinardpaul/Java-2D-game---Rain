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

	public Player(Keyboard input) {
		this.input = input;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update() {
		int xa = 0, ya = 0;
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
		}
	}

	public void render(Screen screen) {
		screen.renderPlayer(x - 16, y - 16, Sprite.player0);
		screen.renderPlayer(x, y - 16, Sprite.player1);
		screen.renderPlayer(x + 16, y - 16, Sprite.player2);

		screen.renderPlayer(x - 16, y, Sprite.player3);
		screen.renderPlayer(x, y, Sprite.player4);
		screen.renderPlayer(x + 16, y, Sprite.player5);

		screen.renderPlayer(x - 16, y + 16, Sprite.player6);
		screen.renderPlayer(x, y + 16, Sprite.player7);
		screen.renderPlayer(x + 16, y + 16, Sprite.player8);
	}

}
