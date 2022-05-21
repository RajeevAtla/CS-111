public class average17
{
    public static void main(String[] args){


        
        
        int[] a = {6, 12, 4, 7, 1, 5};
        System.out.println(mysteryA(a, 0));
        
        int[] b = {1, 3, 7, 5, 2, 13};
        System.out.println(mysteryA(b, 0));
        
        
        
        
    }

    public static int mysteryA(int[] array, int n)
    {
        if(n == array.length)
        {
            return 0;
        }
        return mysteryA(array, n+1) + array[n];
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
    


    
    
    
    
    
    
        

}
