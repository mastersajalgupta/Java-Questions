public class Q75Q2 {
    public static void main(String args [])
    {
        Q75Q2 obj = new Q75Q2();
        int x = 3, y = 5, target = 4;
        System.out.println(obj.canMeasureWater(x,y,target)); 
    }
    public boolean canMeasureWater(int x, int y, int target){
        if(target>x+y) return false;
        if(target == 0) return true;
        return target % gcd(x,y) == 0;
    }
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    
}
