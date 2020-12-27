package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
		System.out.println(snake.size());
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.
		int x = head.getLocation().x;
		int y = head.getLocation().y;

		switch (currentDirection) {
		case DOWN:
			y += 1;
			break;
		case UP:
			y -= 1;
			break;
		case RIGHT:
			x += 1;
			break;
		case LEFT:
			x -= 1;
			break;
		}

		Location loc = new Location(x, y);
		// 2. Iterate through the SnakeSegments in reverse order
		// 2a. Update each snake segment to the location of the segment
		// in front of it.
		for (int i = snake.size()-1; i > 0; i--) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
		}
		// 3. set the location of the head to the new location calculated in step 1
		head.setLocation(loc);
		// 4. set canMove to true
		canMove = true;

	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		if (!(currentDirection == currentDirection.DOWN && d == d.UP)) {
			if (!(currentDirection == currentDirection.UP && d == d.DOWN)) {
				if (!(currentDirection == currentDirection.LEFT && d == d.RIGHT)) {
					if (!(currentDirection == currentDirection.RIGHT && d == d.LEFT)) {
						if (canMove == true) {
							currentDirection = d;
						}
					}
				}
			}
		}
		canMove = false;
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.

	}

	public void reset(Location loc) {
		System.out.println("reset");
		// 1. clear the snake
		snake.clear();
		// 2. set the location of the head
		head.setLocation(loc);
		// 3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outside
		// of the window
		// and false otherwise
		if(head.getLocation().x > 15 || head.getLocation().x < 0 || head.getLocation().y > 12 || head.getLocation().y < 0) {
			return true;
		}	
		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment
		for (int i = 1; i < snake.size(); i++) {
			if(snake.get(i).getLocation().equals(head.getLocation())) {
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake
		for (int i = 1; i < snake.size(); i++) {
			if(snake.get(i).getLocation().equals(loc)) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
