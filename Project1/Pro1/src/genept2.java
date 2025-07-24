
public class genept2 {

    public int findnumtimescodn(String s){
        int ind=0;
        int count=0;
        while(true){
            int occurance=s.indexOf("CTG",ind);
            if(occurance==-1){
                break;
            }
            count++;
            ind=occurance+3;

        }

        return count;


    }

    public double cgRatio(String s) {
        int countC = 0, countG = 0;

        // Count occurrences of 'C' and 'G'
        for (char c : s.toCharArray()) {
            if (c == 'C') countC++;
            if (c == 'G') countG++;
        }

        // Calculate ratio
        return (double) (countC + countG) / s.length();
    }
    
    public int findstopcodon(String s , int startidx, String stopcodon){
        int curridx=s.indexOf(stopcodon, startidx+3);
        while(curridx != -1){
            if((curridx-startidx)%3==0){
                return curridx;
            }
            else{
                curridx=s.indexOf(stopcodon, curridx+1);
            }
        }
        return s.length();

    }

    public String findgene(String s, int where){
        int startidx=s.indexOf("ATG", where);
        if(startidx==-1){
            return "";
        }
        int taaidx=findstopcodon(s, startidx, "TAA");
        int tagidx=findstopcodon(s, startidx, "TAG");
        int tgaidx=findstopcodon(s, startidx, "TGA");
        int temp= Math.min(taaidx,tagidx);
        int minidx=Math.min(tgaidx, temp);
        if(minidx==s.length()){
            return "";
        }
        else{
            return s.substring(startidx, minidx+3);
        }


    }
    public void printall(String s){
        int startidx=0;
        while(true){
           String currgene= findgene(s, startidx);
           if (currgene.isEmpty()){
            break;

           }
           System.out.println(currgene);
           startidx=s.indexOf(currgene, startidx) + currgene.length();
        }

    }

    public  void testgenesimple(){
        String s="AGCTACGAFEAF";
        System.out.println("DNA strand is "+s);
        printall(s);
        double z=cgRatio(s);
        
        System.out.println(z);
        System.out.println("Gene strand is ");

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String p="ATGTGCAGAGAAGAACGCAGCTGCGCCCTCGCCATGCTCTGCGAGTCTCTGCTGA";
        System.out.println(p.length());       
        genept2 obj=new genept2();
        obj.testgenesimple();
        
    }
    
}
    

