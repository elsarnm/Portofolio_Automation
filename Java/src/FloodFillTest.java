import org.junit.*;

public class FloodFillTest {
    // Floodfill function mengganti warna pada (x, y) dan 8 arah disekitarnya
    private void floodFill(int[][] screen, int x, int y, int m, int n, int prevColor, int newColor) {
    } 
    
    // 1. Jika x atau y diluar batas, kembalikan
    @Test
    public void floodFillOutside() {
        // Data Test
            int[][] screen = { { 1, 1, 1, 1, 1, 1, 1, 1 },
                            { 1, 1, 1, 1, 1, 1, 0, 0 },
                            { 1, 0, 0, 1, 1, 0, 1, 1 },
                            { 1, 2, 2, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 2, 2, 0 },
                            { 1, 1, 1, 1, 1, 2, 1, 1 },
                            { 1, 1, 1, 1, 1, 2, 2, 1 } };

            // Row of the display
            int m = 8;

            // Column of the display
            int n = 8;

            // Co-ordinate provided by the user
            int x = 4;
            int y = 4;

            // Current color at that co-ordinate
            int prevColor = screen[x][y];

            // New color that has to be filled
            int newColor = 3;

        // Do Test
        if (x < 0 || x >= m || y < 0 || y >= n)
			return;
        
        // Assert
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
        }
    }  
    
    // 2. Jika warna saat ini bukan warna sebelumnya, kembalikan
    @Test
    public void floodFillNotPrevColor() {
        // Data Test
            int[][] screen = { { 1, 1, 1, 1, 1, 1, 1, 1 },
                            { 1, 1, 1, 1, 1, 1, 0, 0 },
                            { 1, 0, 0, 1, 1, 0, 1, 1 },
                            { 1, 2, 2, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 2, 2, 0 },
                            { 1, 1, 1, 1, 1, 2, 1, 1 },
                            { 1, 1, 1, 1, 1, 2, 2, 1 } };

            // Row of the display
            int m = 8;

            // Column of the display
            int n = 8;

            // Co-ordinate provided by the user
            int x = 4;
            int y = 4;

            // Current color at that co-ordinate
            int prevColor = screen[x][y];

            // New color that has to be filled
            int newColor = 3;

        // Do Test
            if (screen[x][y] != prevColor)
                return;
        
        // Assert
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
        }
    }        
    
    // 3. Ganti warna dan Panggil rekursif untuk 8 arah di sekitar (x, y)
    @Test
    public void floodFillnewColor() {
        // Data Test
            int[][] screen = { { 1, 1, 1, 1, 1, 1, 1, 1 },
                            { 1, 1, 1, 1, 1, 1, 0, 0 },
                            { 1, 0, 0, 1, 1, 0, 1, 1 },
                            { 1, 2, 2, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 0, 1, 0 },
                            { 1, 1, 1, 2, 2, 2, 2, 0 },
                            { 1, 1, 1, 1, 1, 2, 1, 1 },
                            { 1, 1, 1, 1, 1, 2, 2, 1 } };

            // Row of the display
            int m = 8;

            // Column of the display
            int n = 8;

            // Co-ordinate provided by the user
            int x = 4;
            int y = 4;

            // Current color at that co-ordinate
            int prevColor = screen[x][y];

            // New color that has to be filled
            int newColor = 3;

        // Do Test
        screen[x][y] = newColor;
		floodFill(screen, x - 1, y, m, n, prevColor, newColor); // left
		floodFill(screen, x + 1, y, m, n, prevColor, newColor); // right
		floodFill(screen, x, y + 1, m, n, prevColor, newColor); // top
		floodFill(screen, x, y - 1, m, n, prevColor, newColor); // bottom
		floodFill(screen, x - 1, y - 1, m, n, prevColor, newColor); // left
		floodFill(screen, x - 1, y + 1, m, n, prevColor, newColor); // right
		floodFill(screen, x + 1, y + 1, m, n, prevColor, newColor); // top
		floodFill(screen, x + 1, y - 1, m, n, prevColor, newColor);// bottom
        
        // Assert
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
        }
    }       
}
