public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] matrix;

    /**
     * This converts linear data to a matrix based implementation
     * @param rowNum
     * @param colNum
     * @param linerData length must match rowNum * colNum
     */
    public IntegerMatrix(int rowNum, int colNum, int[] linerData){
        if(rowNum * colNum != linerData.length){
            throw new IllegalArgumentException("Length parameters not matching!");
        }
        this.colNum = colNum;
        this.rowNum = rowNum;
        this.matrix = new int[rowNum][colNum];

        for(int i = 0; i < rowNum;++i){
            for (int j = 0; j < colNum; j++) {
                this.matrix[i][j] = linerData[(i * rowNum) + j];
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rowNum;++i){
            sb.append("[");
            for (int j = 0; j < colNum; j++) {
                sb.append(this.matrix[i][j]);
                if(j != colNum - 1){
                    sb.append(" ");
                }
            }
            sb.append("]\n");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntegerMatrix(3, 1, new int[] {1, 2, 3}));
    }
}
