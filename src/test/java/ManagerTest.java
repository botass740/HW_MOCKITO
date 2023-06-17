import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MoviesManager;

public class ManagerTest {

    @Test
    public void emptyArray() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Челюсти 1");

        String[] expected = {"Челюсти 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilms() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Челюсти 1");
        manager.addMovie("Челюсти 2");
        manager.addMovie("Челюсти 3");

        String[] expected = {"Челюсти 1", "Челюсти 2", "Челюсти 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Челюсти 1");
        manager.addMovie("Челюсти 2");
        manager.addMovie("Челюсти 3");

        String[] expected = {"Челюсти 3", "Челюсти 2", "Челюсти 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void aboveLimit() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Челюсти 1");
        manager.addMovie("Челюсти 2");
        manager.addMovie("Челюсти 3");
        manager.addMovie("Челюсти 4");
        manager.addMovie("Челюсти 5");
        manager.addMovie("Челюсти 6");

        String[] expected = {"Челюсти 6", "Челюсти 5", "Челюсти 4", "Челюсти 3", "Челюсти 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Limit() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Челюсти 1");
        manager.addMovie("Челюсти 2");
        manager.addMovie("Челюсти 3");
        manager.addMovie("Челюсти 4");
        manager.addMovie("Челюсти 5");
        //manager.addMovie("Челюсти 6");

        String[] expected = {"Челюсти 5", "Челюсти 4", "Челюсти 3", "Челюсти 2", "Челюсти 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        MoviesManager manager2 = new MoviesManager(3);

        manager2.addMovie("Челюсти 1");
        manager2.addMovie("Челюсти 2");
        manager2.addMovie("Челюсти 3");

        String[] expected = {"Челюсти 1", "Челюсти 2", "Челюсти 3"};
        String[] actual = manager2.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
