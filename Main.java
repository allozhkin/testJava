import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        ShopToys shopToys = new ShopToys(); // создание 'магазина игрушек'
        shopToys.put("prizes"); // заполнение списка игрушек из файла prizes
        shopToys.add(4, "брелок", 6); // метод добавления игрушки
        shopToys.changeFrequency(4,60); // метод  изменения частоты выпадения игрушки по id
        System.out.println(shopToys);

        // создание призового фонда (рандомная очередь игрушек в соответсвии с частотой выпадания)
        ToysLottery toysLottery = new ToysLottery(shopToys);

        Draw winningToys = new Draw(); // розыгрыш игрушек
        winningToys.draw(10, toysLottery); // список разыгранных игрушек
        winningToys.writeToys("winningToys"); // запись игрушек в файл winningToys
        System.out.println(winningToys);

    }
}