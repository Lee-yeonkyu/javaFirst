public class solution12 {
    public static void main(String[] args)
    {

        int plus =0;
        for(int k=0; k<args.length; k++)
        {
            try
            {
                plus = plus + Integer.parseInt(args[k]);
            }
            catch(NumberFormatException e)
            {
                continue;
            }
        }


        System.out.print(plus);


    }


}