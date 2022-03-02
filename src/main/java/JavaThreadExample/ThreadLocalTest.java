package JavaThreadExample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * This class i have created for testing thread local concept
 * Thread confinement
 * ThreadLocal usecase : 1
 * Per Thread or create a thread instances for memory efficiency and Thread Safety
 * <p>
 * ThreadLocal usecase 2:
 * Insure the context for a particular thread
 * <p>
 * Usage tips :
 * Clean up once out of Scope
 * USe Local variable
 * Delegate to Framework
 * <p>
 * Spring framework uses lot of Context Holders
 * LocalContextHolder
 * RequestContextHolder
 * Security contextHolder
 * DateTimeContextHolder
 * So In last when we use the ThreadLocal for particular request or thread we can remove it when the request is processed .
 */
public class ThreadLocalTest
{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main (String[] args) throws InterruptedException
    {

        new Thread(() -> {
            String birthDate = new ThreadLocalTest().birthDate("1");
            System.out.println(birthDate);
        }).start();

        new Thread(() -> {
            String birthDate = new ThreadLocalTest().birthDate("2");
            System.out.println(birthDate);
        }).start();

        //in place of creating 2 thread , lets have for loop for 10 thread all doing the same thing
        //All threads are running their own Runnable task and internally all of them will create their own Date format objects
        //for 1000 thread if we need to run then will create thread pool with 10 threads and internally 100 task will be created and
        //1000 date format objects will be created
        /*
        this is inefficient to create 1000 Dateformat class objects  , because DateFormat can be used accross all different task
        so instead of creating SimpleDate format object for all the object we will place it as Global Date format object
        Problem : Problem with this global single Simple Date format object is its a not a thread Safe
        if 2 or more thread try to access is going to access the same object their is Data integrity issue
        Solution :
        1 way is : have a locks , Syncronozation
        because of this our code is slow down much performance
        No Locks : not a Thread safe
        Locks : Slow down the performance
        Now we want middle ground where each of threads will have their own Date format objects
        And this concept having a variables specific to particular threads is Called Thread local
         */
        for (int i = 0; i < 10; i++) {
            String id = String.valueOf(i);
            new Thread(() -> {
                String bDate = new ThreadLocalTest().birthDate(id);
                System.out.println(bDate);
            }).start();
        }

        for (int i = 0; i < 1000; i++) {
            String id = String.valueOf(i);
            threadPool.submit(() -> {
                String bdate = new ThreadLocalTest().birthDate(id);
                System.out.println("From thread Pool :" + bdate);
            });

        }

        Thread.sleep(1000);
    }

    public String birthDate (String userId)
    {
        //will get the birth Date from Data Base
        Date birthDate = birthDateFromDB(userId);
        //  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //  return sdf.format(birthDate);

        //will use ThreadLocal for each thread to have its own copy
        //SimpleDateFormat sdf= ThreadSafeFormatter.sdf.get();
        return ThreadSafeFormatter.getDate();
        //return sdf.format(birthDate);
    }

    Date birthDateFromDB (String uid)
    {
        return new Date();
    }
}
