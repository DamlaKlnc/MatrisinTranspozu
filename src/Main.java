public class Main {
    public static void main(String[] args) {

        int [][]matris={
                {1,2,7},
                {2,3,4},
                {3,4,6}
        };
        int[][] newMatris=new int[matris[0].length][matris.length];
        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                newMatris[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris: ");
        for(int a[]:matris){
            for(int b:a){
                System.out.print(b+"  ");
            }
            System.out.println();
        }
        System.out.println("Transpoze: ");

        for(int a[]:newMatris){
            for(int b:a){
                System.out.print(b+"  ");
            }
            System.out.println();
        }
    }
}