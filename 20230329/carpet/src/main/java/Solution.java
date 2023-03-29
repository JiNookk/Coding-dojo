class Carpet{
    private final int width;
    private final int height;

    public Carpet(int brown, int yellow) {
        this.width = calculateWidth(brown, yellow);
        this.height = calculateHeight(this.width, brown, yellow);
    }

    public Carpet() {
        this.width = 0;
        this.height = 0;
    }

    public int calculateWidth(int brown, int yellow) {
        int width = 1;
        int height = (brown + yellow) / width;

        while (!(satisfyBrownTile(width, height, brown) &&
                satisfyYellowTile(width, height, yellow))) {
            width += 1;

            height = (brown + yellow) / width;
        }

        return Math.max(width, height);
    }

    public int calculateHeight(int width, int brown, int yellow) {
        return (brown + yellow) / width;
    }

    public boolean satisfyBrownTile(int width, int height, int brown) {
        return 2 * (width + height) - 4 == brown;
    }

    public boolean satisfyYellowTile(int width, int height, int yellow) {
        return (width - 2) * (height - 2) == yellow;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

public class Solution {
    public int[] solution(int brown, int yellow) {
        Carpet carpet = new Carpet(brown, yellow);

        return new int[]{carpet.getWidth(), carpet.getHeight()};
    }
}
