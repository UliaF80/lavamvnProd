import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    protected int id;


    @Test
    public void test() {

        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Product book1 = new Book(112, "Robert", 150, "Jon");
        Product book2 = new Book(250, "Friends", 150, "Jon");
        Product smartphone1 = new Smartphone(150, "Samsung", 5000, "Samsung");
        Product smartphone2 = new Smartphone(312, "Lg", 3000, "Lg");
        Product smartphone3 = new Smartphone(211, "Samsung", 6000, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = {smartphone1, smartphone3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchBy() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Product book1 = new Book(112, "Robert", 150, "Jon");
        Product book2 = new Book(250, "Friends", 150, "Jon");
        Product smartphone1 = new Smartphone(150, "Samsung", 5000, "Samsung");
        Product smartphone2 = new Smartphone(312, "Lg", 3000, "Lg");
        Product smartphone3 = new Smartphone(211, "Samsung", 6000, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);


        Product[] actual = manager.searchBy("Robert");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveById() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);


        Product book1 = new Book(112, "Robert", 150, "Jon");
        Product book2 = new Book(250, "Friends", 150, "Jon");
        Product smartphone1 = new Smartphone(150, "Samsung", 5000, "Samsung");
        Product smartphone2 = new Smartphone(312, "Lg", 3000, "Lg");
        Product smartphone3 = new Smartphone(211, "Samsung", 6000, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);


        Product[] actual = repo.removeById(book1.getId());
        Product[] expected = {book2, smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testManager() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Product book1 = new Book(112, "Robert", 150, "Jon");
        Product book2 = new Book(250, "Friends", 150, "Jon");
        Product smartphone1 = new Smartphone(150, "Samsung", 5000, "Samsung");
        Product smartphone2 = new Smartphone(312, "Lg", 3000, "Lg");
        Product smartphone3 = new Smartphone(211, "Samsung", 6000, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);

    }


}
