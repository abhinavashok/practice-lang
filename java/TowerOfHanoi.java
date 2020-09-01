class TowerOfHanoi{

    public static void main(final String[] args) {
        int noOfDisks =5;
        solveTower(noOfDisks,'s','i','d');
    }

    private static void solveTower(int noOfDisks,char source,char inter,char dest) {
        if(noOfDisks == 1){
            System.out.println("Disk 1 from :"+source +" to :"+dest);
            return;
        }

        solveTower(noOfDisks-1, source,dest, inter);
        System.out.println("Disk"+ noOfDisks +"from :"+source +" to :"+inter);
        solveTower(noOfDisks-1, inter,source, dest);

    }
}