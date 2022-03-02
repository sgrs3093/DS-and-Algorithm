package JavaThreadExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSafeFormatter
{

    public static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>()
    {

        //called once for each Thread
        @Override
        protected SimpleDateFormat initialValue ()
        {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        //Subsequent calls will return same initialized value over and over again
        @Override
        public SimpleDateFormat get ()
        {
            return super.get();
        }
    };

    //OR
    //For Java 8
    //Factory Method will be called for creating with initial value, we dont need to override thr other method
    public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));


    //Based on which thread is calling the get method that thread will get its own copy of the Date Formatter
    public static String getDate ()
    {
        SimpleDateFormat sdf = df.get();
        return sdf.format(new Date());
    }

}
