public class ThreeDimensionalArray {
    public static void main(String args[])
    {
        int num[][][]= new int[3][4][2];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<2;k++)
                {
                    num[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        for(int n[][]:num)
        {
            for(int m[]:n)
            {
                for(int l:m)
                {
                    System.out.print(l+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
