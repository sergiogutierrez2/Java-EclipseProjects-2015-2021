package CS151;

public class Model {
    View view;
    public Board board;
    public Snake snake;
    public Food food;
    public Collision collision;

    public Model() {
        board = new Board();
        snake = new Snake(board);
        food = new Food(board, 6, 4); //#'s to be removed when not testing
        collision = new Collision(board, snake);
    }

    public void attach(View view) {
        this.view = view;
    }

    //resets the board, snake, food and collision
    public void reset() {
        board = new Board();
        snake = new Snake(board);
        food = new Food(board, 6, 4); //#'s to be removed when not testing
        collision = new Collision(board, snake);
    }

    //moves the snake, spawns food if necessary and tells view to update itself
    public void updateModel() {
        //snake movement is calculated
        collision.snakeCollision();
        //spawns food if there isn't one
        food.spawnFood();
        //updates view with new board of tiles
        view.updateGrid(board.tiles);
    }
}