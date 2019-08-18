public class QueueArrayDemo{

    public static void main(String[] args){
        QueueArray<String> Queue = new QueueArray<>(5);
        Queue.Queue("150");
        Queue.Queue("500");
        System.out.println(Queue.DeQueue());
        System.out.println(Queue.DeQueue());
        Queue.DeQueue();
    }

}