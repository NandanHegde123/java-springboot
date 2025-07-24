
public class FindGeneSimpleandTest {
    
    public  String FindGeneSimple(String s){
        
        int startidx=s.indexOf("ATG");
        int curridx=s.indexOf("TAA", startidx+3);
        while(curridx != -1){
            if((curridx-startidx)%3==0){
                return s.substring(startidx, curridx+3);
            }
            else{
                curridx=s.indexOf("TAA", curridx+1);
            }
        }
        

        return "";

    }

    public  void testgenesimple(){
        String s="AATGCGCTAATATGGT";
        System.out.println("DNA strand is "+s);
        String gene=FindGeneSimple(s);
        System.out.println("Gene strand is "+gene);

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FindGeneSimpleandTest obj=new FindGeneSimpleandTest();
        obj.testgenesimple();
        
    }
    
}