package utilz;

import main.Game;

public class Constants {

	public static final float GRAVITY = 0.04f * Game.SCALE;
	public static final int ANI_SPEED = 25;

	public static class Dialogue {
		public static final int QUESTION = 0;
		public static final int EXCLAMATION = 1;

		public static final int DIALOGUE_WIDTH = (int) (14 * Game.SCALE);
		public static final int DIALOGUE_HEIGHT = (int) (12 * Game.SCALE);

		public static int GetSpriteAmount(int type) {
			switch (type) {
			case QUESTION, EXCLAMATION:
				return 5;
			}

			return 0;
		}
	}

	public static class Projectiles {
		public static final int CANNON_BALL_DEFAULT_WIDTH = 15;
		public static final int CANNON_BALL_DEFAULT_HEIGHT = 15;

		public static final int CANNON_BALL_WIDTH = (int) (Game.SCALE * CANNON_BALL_DEFAULT_WIDTH);
		public static final int CANNON_BALL_HEIGHT = (int) (Game.SCALE * CANNON_BALL_DEFAULT_HEIGHT);
		public static final float SPEED = 0.75f * Game.SCALE;
	}

	public static class ObjectConstants {

		// public static final int RED_POTION = 0;
		// public static final int BLUE_POTION = 1;
		// public static final int BARREL = 2;
		// public static final int BOX = 3;
		public static final int SPIKE = 4;
		// public static final int CANNON_LEFT = 5;
		// public static final int CANNON_RIGHT = 6;
		// public static final int TREE_ONE = 7;
		// public static final int TREE_TWO = 8;
		// public static final int TREE_THREE = 9;

		// public static final int RED_POTION_VALUE = 15;
		// public static final int BLUE_POTION_VALUE = 10;

		// public static final int CONTAINER_WIDTH_DEFAULT = 40;
		// public static final int CONTAINER_HEIGHT_DEFAULT = 30;
		// public static final int CONTAINER_WIDTH = (int) (Game.SCALE * CONTAINER_WIDTH_DEFAULT);
		// public static final int CONTAINER_HEIGHT = (int) (Game.SCALE * CONTAINER_HEIGHT_DEFAULT);

		// public static final int POTION_WIDTH_DEFAULT = 12;
		// public static final int POTION_HEIGHT_DEFAULT = 16;
		// public static final int POTION_WIDTH = (int) (Game.SCALE * POTION_WIDTH_DEFAULT);
		// public static final int POTION_HEIGHT = (int) (Game.SCALE * POTION_HEIGHT_DEFAULT);

		public static final int SPIKE_WIDTH_DEFAULT = 32;
		public static final int SPIKE_HEIGHT_DEFAULT = 32;
		public static final int SPIKE_WIDTH = (int) (Game.SCALE * SPIKE_WIDTH_DEFAULT);
		public static final int SPIKE_HEIGHT = (int) (Game.SCALE * SPIKE_HEIGHT_DEFAULT);

		// public static final int CANNON_WIDTH_DEFAULT = 40;
		// public static final int CANNON_HEIGHT_DEFAULT = 26;
		// public static final int CANNON_WIDTH = (int) (CANNON_WIDTH_DEFAULT * Game.SCALE);
		// public static final int CANNON_HEIGHT = (int) (CANNON_HEIGHT_DEFAULT * Game.SCALE);

		// public static int GetSpriteAmount(int object_type) {
		// 	switch (object_type) {
		// 	case RED_POTION, BLUE_POTION:
		// 		return 7;
		// 	case BARREL, BOX:
		// 		return 8;
		// 	case CANNON_LEFT, CANNON_RIGHT:
		// 		return 7;
		// 	}
		// 	return 1;
		// }

		// public static int GetTreeOffsetX(int treeType) {
		// 	switch (treeType) {
		// 	case TREE_ONE:
		// 		return (Game.TILES_SIZE / 2) - (GetTreeWidth(treeType) / 2);
		// 	case TREE_TWO:
		// 		return (int) (Game.TILES_SIZE / 2.5f);
		// 	case TREE_THREE:
		// 		return (int) (Game.TILES_SIZE / 1.65f);
		// 	}

		// 	return 0;
		// }

		// public static int GetTreeOffsetY(int treeType) {

		// 	switch (treeType) {
		// 	case TREE_ONE:
		// 		return -GetTreeHeight(treeType) + Game.TILES_SIZE * 2;
		// 	case TREE_TWO, TREE_THREE:
		// 		return -GetTreeHeight(treeType) + (int) (Game.TILES_SIZE / 1.25f);
		// 	}
		// 	return 0;

		// }

		// public static int GetTreeWidth(int treeType) {
		// 	switch (treeType) {
		// 	case TREE_ONE:
		// 		return (int) (39 * Game.SCALE);
		// 	case TREE_TWO:
		// 		return (int) (62 * Game.SCALE);
		// 	case TREE_THREE:
		// 		return -(int) (62 * Game.SCALE);

		// 	}
		// 	return 0;
		// }

		// public static int GetTreeHeight(int treeType) {
		// 	switch (treeType) {
		// 	case TREE_ONE:
		// 		return (int) (int) (92 * Game.SCALE);
		// 	case TREE_TWO, TREE_THREE:
		// 		return (int) (54 * Game.SCALE);

		// 	}
		// 	return 0;
		// }
	}

	public static class EnemyConstants {
		public static final int PIG = 0;

		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int FALL = 3;
		public static final int GROUND = 4;
		public static final int HIT = 5;
		public static final int DEAD = 6;
		public static final int ATTACK = 7;

		public static final int PIG_WIDTH_DEFAULT = 34;
		public static final int PIG_HEIGHT_DEFAULT = 28;
		public static final int PIG_WIDTH = (int) (PIG_WIDTH_DEFAULT * Game.SCALE);
		public static final int PIG_HEIGHT = (int) (PIG_HEIGHT_DEFAULT * Game.SCALE);
		public static final int PIG_DRAWOFFSET_X = (int) (10 * Game.SCALE);
		public static final int PIG_DRAWOFFSET_Y = (int) (10 * Game.SCALE);

		public static int GetSpriteAmount(int enemy_type, int enemy_state) {
			switch (enemy_state) {

			case IDLE: {
				if (enemy_type == PIG)
					return 11;
			}
			case RUNNING:
				return 6;
			case ATTACK:
				return 5;
			case HIT:
				return 2;
			case DEAD:
				return 4;
			}

			return 0;

		}

		public static int GetMaxHealth(int enemy_type) {
			switch (enemy_type) {
			case PIG:
				return 50;
			default:
				return 1;
			}
		}

		public static int GetEnemyDmg(int enemy_type) {
			switch (enemy_type) {
			case PIG:
				return 100;
			default:
				return 0;
			}
		}
	}

	// public static class Environment {
	// 	public static final int BIG_CLOUD_WIDTH_DEFAULT = 448;
	// 	public static final int BIG_CLOUD_HEIGHT_DEFAULT = 101;
	// 	public static final int SMALL_CLOUD_WIDTH_DEFAULT = 74;
	// 	public static final int SMALL_CLOUD_HEIGHT_DEFAULT = 24;

	// 	public static final int BIG_CLOUD_WIDTH = (int) (BIG_CLOUD_WIDTH_DEFAULT * Game.SCALE);
	// 	public static final int BIG_CLOUD_HEIGHT = (int) (BIG_CLOUD_HEIGHT_DEFAULT * Game.SCALE);
	// 	public static final int SMALL_CLOUD_WIDTH = (int) (SMALL_CLOUD_WIDTH_DEFAULT * Game.SCALE);
	// 	public static final int SMALL_CLOUD_HEIGHT = (int) (SMALL_CLOUD_HEIGHT_DEFAULT * Game.SCALE);
	// }

	public static class UI {
		public static class Buttons {
			public static final int B_WIDTH_DEFAULT = 140;
			public static final int B_HEIGHT_DEFAULT = 56;
			public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
			public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
		}

		public static class PauseButtons {
			public static final int SOUND_SIZE_DEFAULT = 42;
			public static final int SOUND_SIZE = (int) (SOUND_SIZE_DEFAULT * Game.SCALE);
		}

		public static class URMButtons {
			public static final int URM_DEFAULT_SIZE = 56;
			public static final int URM_SIZE = (int) (URM_DEFAULT_SIZE * Game.SCALE);

		}

		public static class VolumeButtons {
			public static final int VOLUME_DEFAULT_WIDTH = 28;
			public static final int VOLUME_DEFAULT_HEIGHT = 44;
			public static final int SLIDER_DEFAULT_WIDTH = 215;

			public static final int VOLUME_WIDTH = (int) (VOLUME_DEFAULT_WIDTH * Game.SCALE);
			public static final int VOLUME_HEIGHT = (int) (VOLUME_DEFAULT_HEIGHT * Game.SCALE);
			public static final int SLIDER_WIDTH = (int) (SLIDER_DEFAULT_WIDTH * Game.SCALE);
		}
	}

	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int FALLING = 3;
		public static final int GROUND = 4;
		public static final int ATTACK = 6;
		public static final int HIT = 5;
		public static final int DEAD = 7;

		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case RUNNING:
				return 8;
			case IDLE:
				return 11;
			case HIT:
				return 2;
			case ATTACK:
				return 3;
			case DEAD:
				return 4;
			case FALLING:
			case JUMP:
			case GROUND:
			default:
				return 1;
			}
		}
	}

}