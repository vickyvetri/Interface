interface Selvaraj
{
void get_Money();
void go_GoodJob();
}
interface Selvi
{
void eating_Food();
void Wake_up();
}

class Vicky implements Selvaraj,Selvi 
{
public static void main(String[] args)
{
Selvaraj vetri = new Vicky();
vetri.get_Money();
vetri.go_GoodJob();

Selvi Vetri = new Vicky();
Vetri.eating_Food();
Vetri.Wake_up();
}
public void get_Money(){System.out.println("The Money has Arrived");}
public void go_GoodJob(){System.out.println("I am looking for a good job");}
public void eating_Food(){System.out.println("I have eaten");}
public void Wake_up(){System.out.println("I just woke up");}
}
