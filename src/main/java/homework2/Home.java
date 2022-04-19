package homework2;

public class Home {
    private int length, height, cost;

    public Home(int length, int height, int cost) {
        this.cost = cost;
        this.height = height;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\nHome{" +
                "length=" + length +
                ", height=" + height +
                ", cost=" + cost +
                '}';
    }

}
