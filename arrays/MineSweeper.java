
public class MineSweeper {
    public static void main(String[] args){
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int numbMine = Integer.parseInt(args[2]);
        char [][] map = new char [width][height];
        for(int i = 0; i < numbMine; i++){
            int x = (int)Math.round(Math.floor(Math.random()*width)) ;
            int y = (int)Math.round(Math.floor(Math.random()*height)); 
            map[x][y] = '*';
            System.out.print(x);
            System.out.println(y);
        }

        int x = 0;
        for(int m = 0; m < height; m++){
            int count = 0;
            for(int n = 0; n < width; n++){
                if(map[m][n] != '*'){
                    x=x+1;
                    System.out.print(m + " & ");
                    System.out.println(n);
                    System.out.println(x);
                    // if(m < width-1 && map[m+1][n] == '*'){
                    //     count += 1;
                    // }
                    // if(n < height-1 && map[m][n+1] == '*'){
                    //     count += 1;
                    // }
                    // if(m < width-1 && n < height-1 && map[m+1][n+1] == '*'){
                    //     count += 1;
                    // }
                    // if(m > 0 && n < height-1 && map[m-1][n+1] == '*'){
                    //     count += 1;
                    // }
                    // if( m < width-1 && n > 0 && map[m+1][n-1] == '*'){
                    //     count += 1;
                    // }
                    // if(m > 0 && n > 0 && map[m-1][n-1] == '*'){
                    //     count += 1;
                    // }
                    // if(n > 0 && map[m][n-1] == '*'){
                    //     count += 1;
                    // }
                    // if(m > 0 && map[m-1][n] == '*'){
                    //     count += 1;
                    // }
                    map[m][n] = (char)count;
                }
            }
        }
    
        for(int m = 0; m < height; m++){
            for(int n = 0; n < width; n++){
                System.out.print(map[m][n]);
            }
            System.out.println();
        }
    }
}
